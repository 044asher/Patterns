package Behavioral.Visitor.Animals;

import Behavioral.Visitor.Visitors.AnimalVisitor;

public interface Animal {
    void accept(AnimalVisitor visitor);
}
