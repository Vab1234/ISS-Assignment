package Java.Collections_Framework;
import java.util.*;

public class IdComparator implements Comparator<Student> {
    
    public int compare(Student s1 , Student s2){

        if(s1.id == s2.id){
            return 0;
        } else if(s1.id > s2.id){
            return 1;
        } else {
            return -1;
        }
    } 

    public static void main(String args[]){
        Student s1 = new Student(108 , "Varun");
        Student s2 = new Student(102 , "Sejal");
        Student s3 = new Student(109 , "Yuvi");

        List<Student> list = new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        Collections.sort(list , new IdComparator());

        for(Student s : list){
            System.out.println(s.id + " " + s.name);
        }
    }
}
