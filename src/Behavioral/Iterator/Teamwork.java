package Behavioral.Iterator;

import Behavioral.Iterator.Iterators.TaskList;
import Behavioral.Iterator.Models.ConcreteTask;
import Behavioral.Iterator.Models.Task;

public class Teamwork {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        taskList.addTask(new ConcreteTask("Title1"));
        taskList.addTask(new ConcreteTask("Title2"));
        taskList.addTask(new ConcreteTask("Title3"));

        System.out.println("Forward iteration:");
        while (taskList.hasNext()){
            Task currentTask = taskList.getNextTask();
            System.out.println("Task: " + currentTask.getTitle());
        }

        taskList.goToEnd();
        System.out.println("\nReverse iteration:");
        while (taskList.hasPrevious()) {
            Task previousTask = taskList.getPreviousTask();
            System.out.println("Task: " + previousTask.getTitle());
        }
    }
}
