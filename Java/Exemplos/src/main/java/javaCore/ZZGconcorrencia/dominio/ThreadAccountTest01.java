package javaCore.ZZGconcorrencia.dominio;

public class ThreadAccountTest01 implements Runnable {

    private Account account = new Account();

    public static void main(String[] args) {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "Hestia");
        Thread t2 = new Thread(threadAccountTest01, "Bell Cranel");

        t1.start();
        t2.start();
    }

    private void witdrawal(int amount) {

        System.out.println(getThreadName() + "###### fora  do synchronized");
        synchronized (account) {
            System.out.println(getThreadName() + "###### dentro  do synchronized");
            if (account.getBalance() >= amount) {
                System.out.println(Thread.currentThread().getName() + " Está indo sacar dinheiro");
                System.out.println(Thread.currentThread().getName() + " Completou o saque, valor da conta " + account.getBalance());
            } else {
                System.out.println(" Sem dinheiro para " + getThreadName() + "Efetuar o saque " + account.getBalance());
            }
        }
    }
    private String getThreadName() {
        return Thread.currentThread().getName();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            witdrawal(10);
            if (account.getBalance() < 0) {
                System.out.println("Fodeo");
            }
        }
    }
}
