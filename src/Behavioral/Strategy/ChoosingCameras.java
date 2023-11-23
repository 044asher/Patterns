package Behavioral.Strategy;

import Behavioral.Strategy.Cameras.GoPro;
import Behavioral.Strategy.Cameras.PhoneCamera;
import Behavioral.Strategy.Cameras.ProfessionalCamera;
import Behavioral.Strategy.VideoRecorders.VideoRecorder;

public class ChoosingCameras {
    public static void main(String[] args) {
        VideoRecorder videoRecorder = new VideoRecorder();
        videoRecorder.setCameraStrategy(new PhoneCamera());
        videoRecorder.recordVideo();

        videoRecorder.setCameraStrategy(new GoPro());
        videoRecorder.recordVideo();

        videoRecorder.setCameraStrategy(new ProfessionalCamera());
        videoRecorder.recordVideo();
    }
}
