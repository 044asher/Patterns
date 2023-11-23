package Behavioral.Interpritator.MovingExpressions;

public class MoveRight implements Expression{
    @Override
    public void interpret(Context context) {
        int currentX = context.getX();
        context.setPosition(currentX + 1, context.getY());
    }
}
