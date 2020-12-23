package inheritance;

public interface Figure {
    double area();
    double perimiter();
    String info();

    static double capacity(Figure f) {
        return f.area() / f.perimiter() * f.perimiter();
    }

    default double capacityD() {
        return area() / perimiter() * perimiter();
    }

}
