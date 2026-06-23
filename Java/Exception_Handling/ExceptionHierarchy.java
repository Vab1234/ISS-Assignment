package Java.Exception_Handling;
/*
 * Java Exception Hierarchy
 *      Throwable
 *          |
 * ---------------------------------------
 * |                                     |
 * Exception                               Error
 * |                                     |
 * |-- IOException                       |-- StackOverflowError
 * |                                     |
 * |-- SQLException                      |-- VirtualMachineError
 * |                                     |
 * |-- ClassNotFoundException            |-- OutOfMemoryError
 * |
 * |-- RuntimeException
 * |
 * |-- ArithmeticException
 * |
 * |-- NullPointerException
 * |
 * |-- NumberFormatException
 * |
 * |-- IndexOutOfBoundsException
 * |
 * |-- ArrayIndexOutOfBoundsException
 * |
 * |-- StringIndexOutOfBoundsException
 */

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHierarchy {
    public static void main(String args[]){
        try {
            int[] numbers = {10, 20, 30};  
            System.out.println(numbers[10]);
  
            String str = "abc";  
            int num = Integer.parseInt(str);
  
            FileReader file = new FileReader("test.txt");
  
        } catch (ArrayIndexOutOfBoundsException e) {  
            System.out.println("Error: Array index is out of bounds.");  
        } catch (NumberFormatException e) {  
            System.out.println("Error: Invalid number format.");  
        } catch (FileNotFoundException e) {  
            System.out.println("Error: File not found.");  
        } catch (Exception e) {  
            System.out.println("Error: An unexpected exception occurred.");  
        }  
        finally{
            System.out.println("Finally block executed.");
        }
        System.out.println("Program continues after handling exceptions...");
    }
}
