package javaCore.ZZGconcorrencia.test;

import javaCore.ZZGconcorrencia.service.StoreService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CompletetableFutureTest02 {


    public static void main(String[] args) {
        
    }
    private static void searchPriceAsyncCompletableFuture(StoreService storeService) {
        long start = System.currentTimeMillis();
      CompletableFuture<Double> priceAsyncFuture1 = storeService.getPricesAsyncCompletableFuture("Store 1");
      CompletableFuture<Double> priceAsyncFuture2 = storeService.getPricesAsyncCompletableFuture("Store 2");
      CompletableFuture<Double> priceAsyncFuture3 = storeService.getPricesAsyncCompletableFuture("Store 3");
      CompletableFuture<Double> priceAsyncFuture4 = storeService.getPricesAsyncCompletableFuture("Store 4");
 
            System.out.println(pricesAsyncFuture1.join());
            System.out.println(pricesAsyncFuture2.join());
            System.out.println(pricesAsyncFuture3.join());
            System.out.println(pricesAsyncFuture4.join());
                        long end = System.currentTimeMillis();
        System.out.println("Time passed to searchPricesSynic %dms%n", (end - start));
           }
}

