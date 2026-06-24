package Java.Collections_Framework;

import java.util.*;

class Student{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;   
    }

    @Override
    public String toString() {
        return "Student : " + id + " - " + name;
    }
}

public class CustomObject {
    public static void main(String args[]){
        System.out.println("Using Lists");
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(1, "Varun"));
        students.add(new Student(2, "Tarun"));
        students.add(new Student(3, "Dipesh"));

        for(Student s : students){
            System.out.println(s);
        }

        System.out.println("Using Sets");
        Set<Student> studentSet = new HashSet<Student>();
        studentSet.add(new Student(1, "Varun"));
        studentSet.add(new Student(2, "Tarun"));
        studentSet.add(new Student(1, "Varun")); 
        // This duplicate value, will be added because the hashcode is different for each object as here the new keyword is used
        studentSet.add(new Student(3, "Dipesh"));

        Iterator<Student> itr = studentSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
