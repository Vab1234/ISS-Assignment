/*  
 - Abstraction in Java means hiding the implementation details and showing only the functionality to the user. It is achieved using abstract classes and interfaces.
 - Abstract classes contain both abstract and non-abstract methods(concrete methods). 
 - An abstract method is a method that is declared without an implementation(body). The subclass of an abstract class must provide an implementation for the abstract methods.
*/

package Java;

abstract class Vehicle{
    abstract void start();
    
    void stop(){
        System.out.println("Vehicle stopped");
    }
}

class Bike extends Vehicle{
    @Override
    void start(){
        System.out.println("Bike started");
    }
}

class Car extends Vehicle{
    @Override
    void start(){
        System.out.println("Car started");
    }

    void display(){
        System.out.println("This is a car");
    }
}

public class P8 {
    public static void main(String args[]){
        Vehicle v1 = new Bike();
        v1.start();
        v1.stop();

        Vehicle v2 = new Car();
        v2.start();
        v1.stop();
        // v2.display();
        // The above commented code will throw a compile time error because the reference variable v2 is of type Vehicle which does not have the display method. To fix this, we need to cast the reference variable v2 to Car before calling the display method.
        Car c1 = (Car) v2;
        c1.display();
    }
}
