package Creational.Builder.Builders;

import Creational.Builder.Interfaces.Builder;
import Creational.Builder.Products.Phone;

public class PhoneBuilder implements Builder {
    private String screen;
    private String battery;
    private String os;
    private String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void buildScreen(String screen) {
        this.screen = screen;
    }

    @Override
    public void buildBattery(String battery) {
        this.battery = battery;
    }

    @Override
    public void buildOS(String os) {
        this.os = os;
    }

    public Phone getResult() {
        return new Phone(name, screen, battery, os);
    }
}
