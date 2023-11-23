package Behavioral.Iterator.Iterators;

import Behavioral.Iterator.Models.Task;

public interface ReverseIterator {
    boolean hasPrevious();
    Task getPreviousTask();
}
