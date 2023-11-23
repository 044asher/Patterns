package Behavioral.Strategy.Cameras;

public class GoPro implements CameraStrategy{
    @Override
    public void chooseCamera() {
        System.out.println("You choose GoPro camera for dynamic video.");
    }
}
