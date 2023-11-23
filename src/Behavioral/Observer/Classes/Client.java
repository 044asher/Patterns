package Behavioral.Observer.Classes;

import Behavioral.Observer.Interfaces.Observer;

public class Client implements Observer {
   private String name;
   public Client(String name){
       this.name = name;
   }
    @Override
    public void update(String message) {
        System.out.println("Client " + name + ": Notification received - " + message);
    }
}
