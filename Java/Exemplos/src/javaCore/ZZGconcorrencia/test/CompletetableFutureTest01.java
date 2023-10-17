package javaCore.ZZGconcorrencia.test;

import javaCore.ZZGconcorrencia.service.StoreService;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CompletetableFutureTest01 {
    public static void main(String[] args) throws InterruptedException {
        StoreService storeService = new StoreService();
        //searchPricesSync(storeService);
        searchPriceAsyncFuture(storeService);
    }

    private static void searchPricesSync(StoreService storeService) throws InterruptedException, ExecutionException {
        long start = System.currentTimeMillis();

        System.out.println(storeService.getPriceSync("Store 1"));
        System.out.println(storeService.getPriceSync("Store 2"));
        System.out.println(storeService.getPriceSync("Store 3"));
        System.out.println(storeService.getPriceSync("Store 4"));

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSynic %d%n", (end - start));
    }

    private static void searchPriceAsyncFuture(StoreService storeService) {
        long start = System.currentTimeMillis();
        Future<Double> pricesAsyncFuture1 = storeService.getPricesAsyncFuture("Store 1");
        Future<Double> pricesAsyncFuture2 = storeService.getPricesAsyncFuture("Store 2");
        Future<Double> pricesAsyncFuture3 = storeService.getPricesAsyncFuture("Store 3");
        Future<Double> pricesAsyncFuture4 = storeService.getPricesAsyncFuture("Store 4");
        try {
            System.out.println(pricesAsyncFuture1.get());
            System.out.println(pricesAsyncFuture2.get());
            System.out.println(pricesAsyncFuture3.get());
            System.out.println(pricesAsyncFuture4.get());

        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSynic %d%n", (end - start));
        StoreService.shutdown();
    }
}

