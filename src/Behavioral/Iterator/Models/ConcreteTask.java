package Behavioral.Iterator.Models;

public class ConcreteTask implements Task{
    private String title;
    public ConcreteTask(String title){
        this.title = title;
    }
    @Override
    public String getTitle() {
        return title;
    }
}
