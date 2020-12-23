package inheritance;

public class Rectangle extends Parallelepiped{
    public int height;
    public int width;

    public Rectangle(int width, int height){
        super(height,width);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return height * width;
    }

    @Override
    public double perimiter() {
        return 2 * height + 2 * width;
    }

    //@Override
    public String info() {
        return "Прямоугольник с высотой:" + height + "шириной:" + width;
    }

}
