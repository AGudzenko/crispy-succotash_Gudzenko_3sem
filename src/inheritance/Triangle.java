package inheritance;

public class Triangle implements Figure{
    int side1;
    int side2;
    public Triangle(int side1, int side2){
        this.side1 = side1;
        this.side2 = side2;
    }


    @Override
    public double area() {
        return (1 / 2) * side1 * side2;
    }

    @Override
    public double perimiter() {
        return side1 + side2;
    }

    @Override
    public String info() {
        return "Треугольник со сторонами: " + side1 + " и " + side2;
    }
}
