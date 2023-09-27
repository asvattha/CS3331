import java.util.ArrayList;
import InclassPractice.*;

public class App {
    public static void main(String[] args) throws Exception {

        Living var1 = new Cat();
        Animal var2 = new Dog();
        Living var3 = new Animal();
        Object var4 = new Animal();

        //var1.a();
        //var1.b();
        //var1.c();
        //var2.b();
        //((Cat)var1).b();
        ((Living)var4).b();

        /* 
        ArrayList<Animal> animals = new ArrayList<>();
        
        Cat c1 = new Cat("Tom");
        Cat c2 = new Cat("Kitty");
        Cat c3 = new Cat("Benton");

        animals.add(c1);
        animals.add(c2);
        animals.add(c3);

        Dog d1 = new Dog("Robin");
        Dog d2 = new Dog("Max");
        Dog d3 = new Dog("Milo");

        animals.add(d1);
        animals.add(d2);
        animals.add(d3);

        for(Animal a: animals){
            System.out.println(a.getName());
            a.speak();
        }
        */

    }
}
