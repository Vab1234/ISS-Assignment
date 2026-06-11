package Java;

class Car{
    int wheels;
    int doors;
    String color;

    Car(int wheels, int doors, String color){
        this.wheels = wheels;
        this.doors = doors;
        this.color = color;
    }

    public String run(){
        return "Car is moving on the road";
    }
}

public class P1{
    public static void main(String args[]){
        Car c1 = new Car(4 , 4 , "Red");
        Car c2 = new Car(4 , 2 , "Black");

        System.out.println("Car 1: " + c1.wheels + " wheels, " + c1.doors + " doors, " + c1.color + " color");
        System.out.println("Car 2: " + c2.wheels + " wheels, " + c2.doors + " doors, " + c2.color + " color");
        System.out.println(c1.run());
        System.out.println(c2.run());
    }
}