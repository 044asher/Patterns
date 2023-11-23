package Behavioral.Visitor.Visitors;

import Behavioral.Visitor.Animals.Lion;
import Behavioral.Visitor.Animals.Monkey;

public class FeedingVisitor implements AnimalVisitor{
    @Override
    public void visit(Lion lion) {
        System.out.println("Lion gets meet.");
    }

    @Override
    public void visit(Monkey monkey) {
        System.out.println("Monkey gets banana.");
    }
}
