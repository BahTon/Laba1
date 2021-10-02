package Factory_Method;

import java.util.ArrayList;
import java.util.List;

public class DZ_1 {
    public static void main(String[] args) {
        List<Dishes> myDishes = new ArrayList<>();
        myDishes.add(new Pasta("Сырная"));
        myDishes.add((new Soup("Борщ")));
        myDishes.add(new Soup("Сырный с грибами"));
        myDishes.forEach(x -> x.process_of_cooking());
    }
}
