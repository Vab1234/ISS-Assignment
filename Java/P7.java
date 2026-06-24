// Final keyword can be used with variable, method and class. It is used to restrict the user. 
// The final variable can not be changed.
// The final method can be inherited but not be overridden. 
// The final class can not be inherited.
// A blank final variable can be initialized only once, either in the declaration or in the constructor.

package Java;

class Vehicle{
    final int maxSpeed = 120;

    // Creating a method to change the value of the final variable speed which will throw a compile time error because we cannot change the value of a final variable.
    void increaseSpeed(){
        // maxSpeed = 150;
        System.out.println("Increasing speed...");
    }

    final void display(){
        System.out.println("Max speed of the vehicle is: " + maxSpeed);
    }
}

// Car class is inheriting the Vehicle class and trying to override the display method which will throw a compile time error because we cannot override a final method.
class Car extends Vehicle{
    // @Override
    // final void display(){
    //     System.out.println("Max speed of the car is: " + maxSpeed);
    // }
}


class Bike{
    static final int maxSpeed;

    // Static final variable can be initialized in a static block. It can be initialized only once and cannot be changed afterwards.
    static {
        maxSpeed = 100;
    }

    void display(){
        System.out.println("Max speed of the bike is: " + maxSpeed);
    }
}


public class P7 {
    public static void main(String args[]){
        Vehicle vehicle = new Vehicle();
        vehicle.display();

        Car car = new Car();
        car.display();

        Bike bike = new Bike();
        bike.display();
    }
}
