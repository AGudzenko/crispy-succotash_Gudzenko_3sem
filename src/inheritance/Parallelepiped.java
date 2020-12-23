package inheritance;

public abstract class Parallelepiped {
    int side1;
    int side2;
    public  Parallelepiped(int side1, int side2){
        this.side1 = side1;
        this.side2 = side2;
    }
    public abstract double area();
    public double perimiter() {
        return 2 * (side1 + side2);
    }
}

