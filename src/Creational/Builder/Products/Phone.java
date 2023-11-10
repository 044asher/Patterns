package Creational.Builder.Products;

public class Phone {
    private String screen;
    private String battery;
    private String os;
    private String name;

    public Phone(String name, String screen, String battery, String os) {
        this.name = name;
        this.screen = screen;
        this.battery = battery;
        this.os = os;
    }
    public String getName(){
        return name;
    }
    public String getScreen() {
        return screen;
    }

    public String getBattery() {
        return battery;
    }

    public String getOS() {
        return os;
    }

}
