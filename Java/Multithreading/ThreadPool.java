package Java.Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class BurgerOrder implements Runnable {
    private int orderNumber;

    public BurgerOrder(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    @Override
    public void run() {
        String chefName = Thread.currentThread().getName();
        
        System.out.println(chefName + " started cooking Order #" + orderNumber);
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println(chefName + " FINISHED Order #" + orderNumber);
    }
}

public class ThreadPool {
    public static void main(String[] args) {
        
        ExecutorService kitchenManager = Executors.newFixedThreadPool(5);
        
        System.out.println("Restaurant is OPEN! 10 orders just came in.");

        for (int i = 1; i <= 10; i++) {
            Runnable order = new BurgerOrder(i);
            kitchenManager.execute(order);
        }

        kitchenManager.shutdown();

        while (!kitchenManager.isTerminated()) {}

        System.out.println("All orders are done. Restaurant is CLOSED!");
    }
}