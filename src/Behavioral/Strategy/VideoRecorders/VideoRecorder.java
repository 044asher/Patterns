package Behavioral.Strategy.VideoRecorders;

import Behavioral.Strategy.Cameras.CameraStrategy;

public class VideoRecorder {
    private CameraStrategy cameraStrategy;
    public void setCameraStrategy(CameraStrategy cameraStrategy){
        this.cameraStrategy = cameraStrategy;
    }
    public void recordVideo(){
        if(cameraStrategy != null){
            cameraStrategy.chooseCamera();
            System.out.println("Video is recording!\n");
        }
        else System.out.println("Error, choose the camera!");
    }
}
