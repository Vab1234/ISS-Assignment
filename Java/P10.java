/*
Runtime polymorphism in Java is also called as Method overriding.
In method overriding the decision to invoke which method is actually taken at runtime and the variables are not overridden
*/

package Java;

class Animal{    
    void eat(){System.out.println("eating");}    
}    
class Dog extends Animal{    
    @Override
    void eat(){System.out.println("eating fruits");}    
}    
class BabyDog extends Dog{  
    @Override  
    void eat(){System.out.println("drinking milk");}    
}  
public class P10{  
    public static void main(String args[]){    
        Animal a1,a2,a3;    
        a1=new Animal();    
        a2=new Dog();    
        a3=new BabyDog();    
        a1.eat();    
        a2.eat();    
        a3.eat();    
    }    
}    