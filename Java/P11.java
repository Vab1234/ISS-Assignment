package Java;

import Java.helper.TempConvertor;
import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TempConvertor converter = new TempConvertor();
        
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        
        double fahrenheit = converter.toFahrenheit(celsius);
        
        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
        
        scanner.close();
    }
}