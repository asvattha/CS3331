import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Cat> cats = new ArrayList<>();
        ArrayList<Dog> dogs = new ArrayList<>();
        
        Cat c1 = new Cat("Tom");
        Cat c2 = new Cat("Kitty");
        Cat c3 = new Cat("Benton");

        cats.add(c1);
        cats.add(c2);
        cats.add(c3);

        Dog d1 = new Dog("Robin");
        Dog d2 = new Dog("Max");
        Dog d3 = new Dog("Milo");

        dogs.add(d1);
        dogs.add(d2);
        dogs.add(d3);

        for (Cat c: cats) {
            System.out.println(c.getName());
        }

        for (Dog d: dogs) {
            System.out.println(d.getName());
        }

    }
}
