package javaCore.ZZGconcorrencia.service;

import java.util.concurrent.*;

public class StoreService {

    private static final ExecutorService ex = Executors.newCachedThreadPool();

    public double getPriceSync(String storeName) throws InterruptedException, ExecutionException {
        System.out.printf("Getting prices sync for store %s%n", storeName);
        return ex.submit(this::priceGenerator).get();
    }

    public Future<Double> getPricesAsyncFuture(String storeName) {
        System.out.printf("Getting prices sync for store %s%n", storeName);
        return ex.submit(this::priceGenerator);

    }
    public CompletableFuture<Double> getPricesAsyncCompletableFuture(String storeName) {
        System.out.printf("Getting prices sync for store %s%n", storeName);
      return CompletableFuture.supplyAsync(this::priceGenerator);

    }

    private double priceGenerator() {
        System.out.printf("%s gerating price %n", Thread.currentThread().getName());
        try {
            delay();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }

    public static  void  shutdown(){
        ex.shutdown();
    }
    private void delay() throws InterruptedException {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
