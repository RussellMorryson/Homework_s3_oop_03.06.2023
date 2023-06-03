package Program;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine extends VendingMachine {
    private List <HotDrink> drinks;

    public HotDrinkVendingMachine() {
        this.drinks = new ArrayList<>();
    }

    public void addDrink (HotDrink drink) {
        drinks.add(drink);
    }

    public String getProduct(String name, int volume, int temperature, int price) {            
        for (HotDrink drink : drinks) {
            if (drink.getName() == name && drink.getVolume() == volume && drink.getTemperature() == temperature && drink.getPrice() == price) {
                System.out.println("Найдено!");
                return drink.toString();
            }
        }
        return "Не найдено3!";
    }

    public void setDrinks(List<HotDrink> drinks) {
        this.drinks = drinks;
    }
    public List<HotDrink> getDrinks() {
        return drinks;
    }  

    public List<HotDrink> convertToList (HotDrinkVendingMachine o) {        
        List <HotDrink> list = new ArrayList<HotDrink>();
        for(HotDrink drink : getDrinks()) {
            list.add(drink);
        } 
        return list;       
    }
}