package InclassPractice;

public class Dog extends Animal{
    public void a(){
        System.out.println("Dog a");
    }
    public void c(){
        b();
        System.out.println("Dog c");
    }
}
