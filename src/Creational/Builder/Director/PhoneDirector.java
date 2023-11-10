package Creational.Builder.Director;

import Creational.Builder.Interfaces.Builder;

public class PhoneDirector {

    public void constructAndroidPhone(Builder builder) {
        builder.setName("Samsung Galaxy S23+");
        builder.buildScreen("LCD");
        builder.buildBattery("5000 mAh");
        builder.buildOS("Android");
    }

    public void constructIOSPhone(Builder builder) {
        builder.setName("iPhone 15 Pro");
        builder.buildScreen("LCD");
        builder.buildBattery("4200 mAh");
        builder.buildOS("iOS");
    }
}
