package inheritance;

public class Squaresquare extends Rectangle{
    public int side;
    public Squaresquare(int side){
        super(side, side);
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimiter() {
        return 4 * side;
    }

    @Override
    public String info() {
        return "Квадрат со стороной: " + side;
    }

}
