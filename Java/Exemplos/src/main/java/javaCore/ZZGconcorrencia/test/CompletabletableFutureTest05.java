package javaCore.ZZGconcorrencia.test;

import javaCore.ZZGconcorrencia.dominio.Quote;
import javaCore.ZZGconcorrencia.service.StoreServiceWithDiscount;

import java.util.concurrent.CompletableFuture;
import java.util.List;

public class CompletabletableFutureTest05 {

    public static void main(String[] args) {
        StoreServiceWithDiscount service = new StoreServiceWithDiscount();
        searchPricesWithDiscountAsync(service);
    }

    private static void searchPricesWithDiscountAsync(StoreServiceWithDiscount service) {
        long start = System.currentTimeMillis();

        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");

        CompletableFuture<?>[] completableFutures = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> service.getPriceSync(s)))
                .map(cf -> cf.thenApply(Quote::newQuote))
                .map(cf -> cf.thenCompose(quote -> CompletableFuture.supplyAsync(() -> service.applyDiscount(quote))))
                .map(cf -> cf.thenAccept(store -> System.out.printf("%s Finished in %d%n", store, (System.currentTimeMillis() - start))))
                .toArray(CompletableFuture[]::new);

        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.allOf(completableFutures);
        voidCompletableFuture.join();
        System.out.printf("Finished ? %b", voidCompletableFuture.isDone());

        long end = System.currentTimeMillis();
        System.out.printf("Tempo para pesquisar preços assincronamente: %dms%n", (end - start));
    }
}

