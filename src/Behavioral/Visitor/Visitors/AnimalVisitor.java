package Behavioral.Visitor.Visitors;

import Behavioral.Visitor.Animals.Lion;
import Behavioral.Visitor.Animals.Monkey;

public interface AnimalVisitor {
    void visit(Lion lion);
    void visit(Monkey monkey);
}
