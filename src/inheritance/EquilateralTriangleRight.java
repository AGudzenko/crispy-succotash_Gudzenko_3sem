package inheritance;

import static java.lang.StrictMath.sqrt;

public class EquilateralTriangleRight implements Figure{
    int side;
    public EquilateralTriangleRight(int side){
        this.side = side;
    }

    @Override
    public double area() {
        return (side * side * sqrt(3)) / 4;
    }

    @Override
    public double perimiter() {
        return side * 3;
    }

    @Override
    public String info() {
        return "Сторона равностороннего треугольника: " +  side;
    }
}
