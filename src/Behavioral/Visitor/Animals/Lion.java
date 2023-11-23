package Behavioral.Visitor.Animals;

import Behavioral.Visitor.Visitors.AnimalVisitor;

public class Lion implements Animal{
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }
}
