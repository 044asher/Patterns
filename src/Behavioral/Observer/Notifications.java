package Behavioral.Observer;

import Behavioral.Observer.Classes.Client;
import Behavioral.Observer.Classes.PostOffice;

public class Notifications {
    public static void main(String[] args) {
        PostOffice postOffice = new PostOffice();
        Client client1 = new Client("John");
        Client client2 = new Client("Peter");

        postOffice.addObserver(client1);
        postOffice.addObserver(client2);

        postOffice.setPackageStatus("On your way!");
        postOffice.removeObserver(client2);
        postOffice.setPackageStatus("Your package is waiting for you!");
    }
}
