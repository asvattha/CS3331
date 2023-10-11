public class App {
    public static void main(String[] args) throws Exception {
        
        House house1 = new House(1, 1750.50);
        House house2 = (House)house1.clone();
    }
}
