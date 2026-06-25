package Java.Multithreading;

public class Synchronization {

    private int sharedStaplerUses = 0;

    // METHOD SYNCHRONIZED

    public synchronized void processTaskMethodSync() {
        try {
            System.out.println(Thread.currentThread().getName() + " is reading the file...");
            Thread.sleep(3000);
            
            sharedStaplerUses++;
            System.out.println(Thread.currentThread().getName() + " finished stapling.");
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // BLOCK SYNCHRONIZED
    public void processTaskBlockSync() {
        try {
            System.out.println(Thread.currentThread().getName() + " is reading the file...");
            Thread.sleep(3000);

            synchronized (this) {
                sharedStaplerUses++;
                System.out.println(Thread.currentThread().getName() + " finished stapling.");
            }
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Synchronization office = new Synchronization();

        Thread worker1 = new Thread(() -> office.processTaskBlockSync(), "Worker-1");
        Thread worker2 = new Thread(() -> office.processTaskBlockSync(), "Worker-2");

        Thread worker3 = new Thread(() -> office.processTaskMethodSync(), "Worker-3");
        Thread worker4 = new Thread(() -> office.processTaskMethodSync(), "Worker-4");

        worker1.start();
        worker2.start();
        worker3.start();
        worker4.start();
    }
}
