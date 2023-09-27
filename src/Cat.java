import java.util.ArrayList;

public class Cat extends Animal{
   String name;
   
   public Cat(String name){
    super(name);
   }

   public void speak(){
    System.out.println("Meow");
   }

}
