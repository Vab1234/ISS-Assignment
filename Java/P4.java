// Different types of loops in Java

package Java;

public class P4 {
    public static void main(String args[]){
        String[] arr = {"Java", "Python", "C++", "JavaScript"};

        // For loop
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = arr[i].toUpperCase();
            System.out.println(arr[i]);
        }

        // For-each loop
        for(String str : arr){
            System.out.println(str);
        }

        // While loop
        int j = 0;
        int num = 345;
        int rev = 0;
        while(num > 0 ){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        System.out.println(rev);

        // Do-while loop : Printed atleast once even if the condition is false
        boolean condition = false;
        do{
            System.out.println("This will be printed at least once.");
        } while(condition);
    }
}
