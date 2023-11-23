package Behavioral.Iterator.Iterators;

import Behavioral.Iterator.Models.Task;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class TaskList implements TaskIterator, ReverseIterator{
    private List<Task> tasks;
    private int currentPosition;
    public TaskList(){
        tasks = new ArrayList<>();
        currentPosition = 0;
    }
    public void addTask(Task task){
        tasks.add(task);
    }
    @Override
    public boolean hasNext() {
        return currentPosition < tasks.size();
    }
    @Override
    public Task getNextTask() {
        if (hasNext()) {
            Task task = tasks.get(currentPosition);
            currentPosition++;
            return task;
        } else {
            throw new NoSuchElementException("No more tasks");
        }
    }

    @Override
    public boolean hasPrevious() {
        return currentPosition > 0;
    }

    @Override
    public Task getPreviousTask() {
        if (hasPrevious()) {
            currentPosition--;
            return tasks.get(currentPosition);
        } else {
            throw new NoSuchElementException("No previous tasks");
        }
    }
    public void goToEnd(){
        currentPosition = tasks.size();
    }
}
