import java.util.ArrayList;

public class Animal {
   
    String name;

    public Animal(String name){
        this.name = name;
    } 
    
    public String getName(){
        return name;
    }

    public void speak(){
        System.out.println("???");
    }

}
