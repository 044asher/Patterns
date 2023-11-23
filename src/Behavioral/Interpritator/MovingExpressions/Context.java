package Behavioral.Interpritator.MovingExpressions;

public class Context {
    private int x;
    private int y;
    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }

    public int getY() {
        return y;
    }
}
