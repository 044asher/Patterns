package Behavioral.Iterator.Iterators;

import Behavioral.Iterator.Models.Task;

public interface TaskIterator {
    boolean hasNext();
    Task getNextTask();
}
