package javaCore.ZZGconcorrencia.test;

import java.util.concurrent.*;

class RandomNumberCallable implements Callable<String> {
    private Object num;

    @Override
    public String call() throws Exception {
        Math.random();
        int count = ThreadLocalRandom.current().nextInt(1, 11);
        for (int i = 0; i < count; i++) {
            System.out.printf("%s executando uma tarefa callable...", Thread.currentThread().getName());
        }
        return String.format("%s finished and the random number is %d", Thread.currentThread().getName(), num);
    }
}
public class CallableTest01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        RandomNumberCallable randomNumberCallable = new RandomNumberCallable();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> future = executorService.submit(randomNumberCallable);
        String s = future.get();
        System.out.printf("Programa finished %s",s);
        executorService.shutdown();
    }
}
