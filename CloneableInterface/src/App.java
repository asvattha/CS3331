import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<House> houses = new ArrayList();
        House house1 = new House(1, 1750.50);
        House house1_clone = (House)house1.clone();

        houses.add(house1);
        houses.add(new House(2, 2000));
        houses.add(new House(3, 1930));

        Collections.sort(houses);
        System.out.println(houses);
    }
}
