package javaCore.ZZGconcorrencia.test;

import javaCore.ZZGconcorrencia.service.StoreService;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompletetableFutureTest02 {

    public static void main(String[] args) {
        StoreService storeService = new StoreService();
        searchPriceAsyncCompletableFuture(storeService);
    }

    private static void searchPriceAsyncCompletableFuture(StoreService storeService) {
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store 1", "Store 2", "Store  3", "Store 4");

        List<CompletableFuture<Double>> completableFutures = stores.stream()
                .map(storeService::getPricesAsyncCompletableFuture)
                .collect(Collectors.toList());

        // Agregue todos os CompletableFutures em um CompletableFuture global
        CompletableFuture<Void> allFutures = CompletableFuture.allOf(
                completableFutures.toArray(new CompletableFuture[0])
        );

        // Obtém o resultado de todos os CompletableFutures quando estiverem completos
        CompletableFuture<List<Double>> allResults = allFutures.thenApply(v ->
                completableFutures.stream()
                        .map(CompletableFuture::join)
                        .collect(Collectors.toList())
        );

        // Aguarde a conclusão de todos os CompletableFutures e obtenha os resultados
        List<Double> prices = allResults.join();

        System.out.println(prices);
        long end = System.currentTimeMillis();
        System.out.printf("Tempo para pesquisar preços assincronamente: %dms%n", (end - start));
    }
}
