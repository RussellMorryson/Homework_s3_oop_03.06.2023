package Program;

import java.util.List;
import java.util.ArrayList;

public class VendingMachine {
    public List <Product> products;

    public VendingMachine () {
        this.products = new ArrayList<>();
    }

    public String getProduct(String name, int volume) {
        for (Product product : products) {
            if (product.getName() == name && product.getVolume() == volume) {
                System.out.println("Найдено!");
                return product.toString();
            }
        }
        return "Не найдено!";
    }    
}