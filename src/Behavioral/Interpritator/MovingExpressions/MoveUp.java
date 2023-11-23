package Behavioral.Interpritator.MovingExpressions;

public class MoveUp implements Expression{
    @Override
    public void interpret(Context context) {
        int currentY = context.getY();
        context.setPosition(context.getX(), currentY + 1);
    }
}
