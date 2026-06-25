package Java.Multithreading;

class OrderFood extends Thread{
    private String actionDone;

    OrderFood(String actionDone){
        this.actionDone = actionDone;
    }

    public void run(){
        System.out.println(actionDone + ": Request processing started");
        try{
            Thread.sleep(2000);
        } catch(InterruptedException e){
            System.out.println("An unexpected exception occured");
        }
        System.out.println("Processing completed for request " + actionDone);
    }
}

public class Multithreading {
    public static void main(String args[]){
        OrderFood o1 = new OrderFood("Add biryani to cart");
        OrderFood o2 = new OrderFood("Payment");

        o1.start();
        o2.start();
    }
}
