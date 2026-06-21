// Datatypes in java are categorized as primitives and non-primitives
// Primitive datatyes are predefined in java and are not objects. They include byte, short, int, long, float, double, char and boolean.
// Non-primitive datatypes are objects and include classes, interfaces, arrays and strings.

package Java;
public class P2 {
    public static void main(String args[]){
        // Primitive datatypes
        int a = 10;
        double b = 3.14;
        char c = 'A';
        boolean d = true;

        System.out.println("Primitive datatypes:");
        System.out.println("Integer: " + a);
        System.out.println("Double: " + b);
        System.out.println("Character: " + c);
        System.out.println("Boolean: " + d);

        // Non-primitive datatypes
        String str = "Hello, World!";
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("\nNon-primitive datatypes:");
        System.out.println("String: " + str);
        System.out.print("Array: ");
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}