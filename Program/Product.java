package Program;

public class Product {
    protected String name;
    protected int volume;    

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setVolume(int volume) 
    {
        this.volume = volume;
    }
    public int getVolume() {
        return volume;
    }
}