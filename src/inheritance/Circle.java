package inheritance;


public class Circle implements Figure {
    private final int radius;
    double p = 3.14;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return p * radius * radius;
    }

    @Override
    public double perimiter() {
        return 2 * p * radius;
    }

    @Override
    public String info() {
        return "Круг с радиусом: " + radius;
    }

    @Override
    public double capacityD() {
        return 1 / 4 * p;
    }

}
