package Behavioral.Interpritator;

import Behavioral.Interpritator.MovingExpressions.*;

class Moving {
    public static void main(String[] args) {
        Context context = new Context();

        Expression moveUp = new MoveUp();
        Expression moveDown = new MoveDown();
        Expression moveLeft = new MoveLeft();
        Expression moveRight = new MoveRight();

        moveUp.interpret(context);
        System.out.println("Current position: (" + context.getX() + ", " + context.getY() + ").");

        moveDown.interpret(context);
        System.out.println("Current position: (" + context.getX() + ", " + context.getY() + ").");

        moveRight.interpret(context);
        System.out.println("Current position: (" + context.getX() + ", " + context.getY() + ").");

        moveLeft.interpret(context);
        System.out.println("Current position: (" + context.getX() + ", " + context.getY() + ").");
    }
}