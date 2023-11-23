package Behavioral.Strategy.Cameras;

public class ProfessionalCamera implements CameraStrategy{
    @Override
    public void chooseCamera() {
        System.out.println("You choose Professional camera for 4K video.");
    }
}
