import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

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

        /* 
        for (Cat c: cats) {
            System.out.println(c.getName());
        }

        for (Dog d: dogs) {
            System.out.println(d.getName());
        }
        */

        for(Animal a: animals){
            System.out.println(a.getName());
            a.speak();
        }

    }
}
