package Behavioral.Visitor.Animals;

import Behavioral.Visitor.Visitors.AnimalVisitor;

public class Monkey implements Animal{
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }
}
