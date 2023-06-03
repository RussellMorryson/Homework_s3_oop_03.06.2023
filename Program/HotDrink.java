package Program;

public class HotDrink extends Product implements Comparable <HotDrink> {
    private int temperature;
    private int price;

    protected HotDrink(String name, int volume, int temperature, int price) {
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
        this.price = price;
    }

    protected void setTemperature(int temperature) {
        this.temperature = temperature;
    }    
    public int getTemperature() {
        return temperature;
    }

    protected void setPrice (int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Горячий напиток: " + name 
        + ", объем: " + volume 
        + ", температура: " + temperature 
        + ", цена: " + price;
    }

    @Override
    public int compareTo(HotDrink o) {
        return this.getPrice() - o.getPrice();
    }

}