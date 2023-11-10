package Creational.Builder.Interfaces;


public interface Builder {
    void setName(String name);
    void buildScreen(String screen);
    void buildBattery(String battery);
    void buildOS(String os);
}
