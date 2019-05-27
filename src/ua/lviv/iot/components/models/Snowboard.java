package ua.lviv.iot.components.models;

public class Snowboard extends Equipment {
    private int size;
    private String name;
    public Snowboard () {
    }
    public Snowboard(String brand, double price, String forkids) {
        super(brand, price, forkids);

    }
    private int getSize () {
        return size ;

    }
    public void setSize(int size) {
        this.size = size;

    }
    public String getName() {
        return name;

    }
    public void setName(String name) { this.name = name; }
}