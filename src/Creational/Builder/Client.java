package Creational.Builder;

import Creational.Builder.Builders.ManualBuilder;
import Creational.Builder.Builders.PhoneBuilder;
import Creational.Builder.Director.PhoneDirector;
import Creational.Builder.Products.Manual;
import Creational.Builder.Products.Phone;

public class Client {
    public static void main(String[] args) {
        PhoneDirector phoneDirector = new PhoneDirector();
        PhoneBuilder phoneBuilder = new PhoneBuilder();
        ManualBuilder manualBuilder = new ManualBuilder();


        phoneDirector.constructAndroidPhone(phoneBuilder);
        Phone androidPhone = phoneBuilder.getResult();
        System.out.println("Phone built: " + androidPhone.getName());

        phoneDirector.constructAndroidPhone(manualBuilder);
        Manual manual = manualBuilder.getResult();
        System.out.println("Phone manual built: " + manual.print());




        phoneDirector.constructIOSPhone(phoneBuilder);
        Phone iOSPhone = phoneBuilder.getResult();
        System.out.println("Phone created: " + iOSPhone.getName());

        phoneDirector.constructIOSPhone(manualBuilder);
        Manual manual1 = manualBuilder.getResult();
        System.out.println("Phone manual built: " + manual1.print());
    }
}
