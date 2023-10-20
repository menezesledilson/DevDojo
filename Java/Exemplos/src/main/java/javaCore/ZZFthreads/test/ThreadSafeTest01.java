package javaCore.ZZFthreads.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class ThreadsafeNames{
    private final List<String> names = Collections.synchronizedList(new ArrayList<>());

    public synchronized  void add (String name){
        names.add(name);
    }

    public synchronized void removeFirst(){
        if(names.size() > 0){
            System.out.println(Thread.currentThread().getName());
            System.out.println(names.remove(0));
        }
    }
}
public class ThreadSafeTest01 {
    public static void main(String[] args) {
        ThreadsafeNames threadsafeNames = new ThreadsafeNames();
        threadsafeNames.add("Junkrat");
        Runnable r = threadsafeNames::removeFirst;
        new Thread(r).start();
        new Thread(r).start();
    }
}
