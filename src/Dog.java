import java.util.ArrayList;

public class Dog extends Animal{
   String name;
   
   public Dog(String name){
    super(name);
   }

   public void speak(){
    System.out.println("Woof");
   }

}