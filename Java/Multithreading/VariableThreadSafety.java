package Java.Multithreading;

public class VariableThreadSafety {
    private int sharedInstanceCounter = 0;

    public void countNumbers() {
        int privateLocalCounter = 0;

        for (int i = 0; i < 1000; i++) {
            sharedInstanceCounter++;
            privateLocalCounter++;
            Thread.yield();
        }

        System.out.println(Thread.currentThread().getName() + " finished. Its Private Local Counter is: " + privateLocalCounter);
    }

    public static void main(String[] args) throws InterruptedException {
        
        VariableThreadSafety myObject = new VariableThreadSafety();

        Thread t1 = new Thread(() -> {
            myObject.countNumbers();
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            myObject.countNumbers();
        }, "Thread-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("-------------------------------------------------");
        System.out.println("Expected Shared Instance Counter: 2000");
        System.out.println("Actual Shared Instance Counter:   " + myObject.sharedInstanceCounter);
    }
}
