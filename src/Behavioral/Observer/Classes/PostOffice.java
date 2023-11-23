package Behavioral.Observer.Classes;

import Behavioral.Observer.Interfaces.Observable;
import Behavioral.Observer.Interfaces.Observer;
import java.util.ArrayList;
import java.util.List;

public class PostOffice implements Observable {
    private List<Observer> observers = new ArrayList<>();
    private String packageStatus;
    public void setPackageStatus(String packageStatus) {
        this.packageStatus = packageStatus;
        notifyObservers("Package status: " + packageStatus);
    }
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for(Observer observer : observers){
            observer.update(message);
        }
    }


}
