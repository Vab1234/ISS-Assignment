package Java.Collections_Framework;

import java.util.*;

class Student implements Comparable<Student>{
    int id;
    String name;

    public Student(int id , String name){
        this.id = id;
        this.name = name;
    }
    
    @Override
    public int compareTo(Student s){
        if(id == s.id){
            return 0;
        } else if(id > s.id){
            return 1;
        } else{
            return -1;
        }
    }
}

public class StudentComparable {
    public static void main(String args[]){
        Student s1 = new Student(1 , "Varun");
        Student s2 = new Student(2 , "Sejal");
        Student s3 = new Student(3 , "Yuvi");

        List<Student> list = new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        Collections.sort(list);

        for(Student s : list){
            System.out.println(s.id + " " +  s.name);
        }

    }
}
