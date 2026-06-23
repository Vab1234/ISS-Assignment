/*
The throw keyword in Java is used to explicitly throw an exception. 
It can be used to throw both checked and unchecked exceptions. When an exception is thrown, the normal flow of the program is disrupted, and the control is transferred to the nearest catch block that can handle the exception.
*/

package Java.Exception_Handling;

public class Throw {

    public static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Age must be at least 18 to drive a vehicle.");
        } else {
            System.out.println("You are eligible to drive a vehicle.");
        }
    }
    public static void main(String args[]){
        checkAge(15);
    }
}
