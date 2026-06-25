// The volatile keyword is used with variables which are accessed and modified by diff threads at the same time and it ensures threads read the value of that variable from the main memory only and not their local cache

package Java.Multithreading;

public class Volatile {
    private static volatile boolean restaurantOpen = true;

    public static void main(String[] args) throws InterruptedException {
        
        Thread chef = new Thread(() -> {
            System.out.println("Chef: I am starting my shift!");
            
            while (restaurantOpen) {}
            
            System.out.println("Chef: I see the sign says Closed. I am going home.");
        });

        chef.start();

        Thread.sleep(1000);
        
        System.out.println("Manager: Flipping the sign to CLOSED.");
        restaurantOpen = false; 
    }
}
