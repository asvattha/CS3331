package KC1;

public class Derived extends Base{
    public void methodOne(){
        super.methodOne();
        System.out.println("C");
    }
    
    public void methodTwo(){
        super.methodTwo();
        System.out.println("D");
    }
}
