package Java.Exception_Handling;

public class ExceptionHandling {
    public static void main(String[] args) {  
        try {  
            int data = 25 / 0; // May throw ArithmeticException  
            System.out.println("Result: " + data);  
        } catch (ArithmeticException e) {  
            System.out.println("Error: Division by zero is not allowed.");  
        } finally {  
            System.out.println("This block always executes.");  
        }  
  
        System.out.println("Program continues after finally block...");    
    }  
}  
