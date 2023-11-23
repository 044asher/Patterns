package Behavioral.Visitor;

import Behavioral.Visitor.Animals.Animal;
import Behavioral.Visitor.Animals.Lion;
import Behavioral.Visitor.Animals.Monkey;
import Behavioral.Visitor.Visitors.AnimalVisitor;
import Behavioral.Visitor.Visitors.FeedingVisitor;

public class Zoo {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal monkey = new Monkey();

        AnimalVisitor visitor = new FeedingVisitor();

        lion.accept(visitor);
        monkey.accept(visitor);
    }
}
