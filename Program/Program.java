package Program;

import java.util.Collections;
import java.util.List;

public class Program {
    public static <T> void main(String[] args) {
        HotDrink drink1 = new HotDrink("Кофе", 200, 80, 100);
        HotDrink drink2 = new HotDrink("Кофе", 300, 80, 120);
        HotDrink drink3 = new HotDrink("Чай", 200, 70, 50);
        HotDrink drink4 = new HotDrink("Чай", 300, 70, 75);
        HotDrink drink5 = new HotDrink("Горячий шоколад", 200, 70, 110);
        HotDrink drink6 = new HotDrink("Двойной горячий шорколад", 200, 70, 140);

        HotDrinkVendingMachine listOfDrinks = new HotDrinkVendingMachine();
        listOfDrinks.addDrink(drink1);
        listOfDrinks.addDrink(drink2);
        listOfDrinks.addDrink(drink3);
        listOfDrinks.addDrink(drink4);
        listOfDrinks.addDrink(drink5);
        listOfDrinks.addDrink(drink6);

        List <HotDrink> list = listOfDrinks.convertToList(listOfDrinks);        
        Collections.sort(list);
        for(HotDrink e : list) {
            System.out.println(e.toString());
        }

        /*
        String findDrink1 = listOfDrinks.getProduct("Кофе", 300, 80);
        System.out.println(findDrink1 + "\n");
        String findDrink2 = listOfDrinks.getProduct("Чай", 300, 70);
        System.out.println(findDrink2 + "\n");
        */
    }
}