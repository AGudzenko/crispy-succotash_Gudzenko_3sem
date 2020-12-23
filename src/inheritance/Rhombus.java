package inheritance;

import static java.lang.StrictMath.sqrt;

public class Rhombus extends Parallelepiped{
    int diag1;
    int diag2;
    int side = (int) sqrt((diag1 * diag1) / 4 + (diag2 * diag2) / 4);

    public Rhombus(int diag1, int diag2, int side){
        super(side, side);
        this.diag1 = diag1;
        this.diag2 = diag2;
    }

    @Override
    public double area() {
        return (diag1 * diag2) / 2;
    }

    @Override
    public double perimiter() {
        return 4 * sqrt( (diag1 / 1) * (diag1 / 1) + (diag1 / 2) * (diag1 / 2));
    }

    //@Override
    public String info() {
        return "Диагонали ромба: " + diag1 + " и " + diag1;
    }
}
