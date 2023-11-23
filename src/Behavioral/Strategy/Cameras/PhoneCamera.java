package Behavioral.Strategy.Cameras;

public class PhoneCamera implements CameraStrategy{
    @Override
    public void chooseCamera() {
        System.out.println("You choose Phone camera for simple video!");
    }
}
