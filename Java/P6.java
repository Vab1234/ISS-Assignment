package Java;

class Employee{
    private int id;
    private String name;
    private String email;

    public Employee(int id , String name , String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public void doWork(){
        System.out.println("Employee is working");
    }

    public void checkin(){
        System.out.println("Employee is checking in");
    }

    public void checkout(){
        System.out.println("Employee is checking out");
    }
    
}

class Teacher extends Employee{
    private String subject;

    public Teacher(int id , String name , String email , String subject){
        super(id , name , email);
        this.subject = subject;
    }

    public void doWork(){
        System.out.println("Teacher is teaching");
    }

    public void checkin(){
        System.out.println("Teacher is checking in");
    }

    public void checkout(){
        System.out.println("Teacher is checking out");
    }

    public void doCalculation(int a , int b){
        int result = a + b;
        System.out.println("Calculation result: " + result);
    }

    public void doCalculation(int a , int b , int c){
        int result = a + b + c;
        System.out.println("Calculation result: " + result);
    }
}

class Analyst extends Employee{
    private String department;

    public Analyst(int id , String name , String email , String department){
        super(id , name , email);
        this.department = department;
    }

    public void doWork(){
        System.out.println("Analyst is analyzing");
    }

    public void checkin(){
        System.out.println("Analyst is checking in");
    }

    public void checkout(){
        System.out.println("Analyst is checking out");
    }
}

public class P6 {
    public static void main(String args[]){
        Employee emp = new Employee(1, "John", "john@example.com");
        emp.doWork();
        emp.checkin();
        emp.checkout();

        Teacher teacher = new Teacher(2, "Alice", "alice@example.com", "Math");
        teacher.doWork();
        teacher.checkin();
        teacher.checkout();
        teacher.doCalculation(5,100);
        teacher.doCalculation(5,100,200);

        Analyst analyst = new Analyst(3, "Bob", "bob@example.com", "Finance");
        analyst.doWork();
        analyst.checkin();
        analyst.checkout();
    }
    
}
