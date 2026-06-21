// Decision Making
package Java;

public class P5 {
    public static void main(String args[]){
        int studentMarks = Integer.parseInt(args[0]);
        if(studentMarks >= 90){
            System.out.println("Grade: A");
        } else if(studentMarks >= 80){
            System.out.println("Grade: B");
        } else if(studentMarks >= 70){
            System.out.println("Grade: C");
        } else if(studentMarks >= 60){
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        String day = args[1];
        switch(day){
            case  "Monday" : 
                System.out.println("Today is Monday");
                break;
            case "Tuesday" :
                System.out.println("Today is tuesday");
                break;
            case "Wednesday" : 
                System.out.println("Today is Wednesday");
                break;
            case "Thursday" :
                System.out.println("Today is Thursday");
                break;
            case "Friday" :
                System.out.println("Today is Friday");
                break;
            case "Saturday" :
                System.out.println("Today is Saturday");
                break;
            case "Sunday" :
                System.out.println("Today is Sunday");
                break;
            default :
                System.out.println("Invalid day");
        }
    }
}
