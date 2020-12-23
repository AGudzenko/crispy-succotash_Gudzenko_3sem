package inheritance;

public class FigureExamples {
    public static void main(String[] args) {


        Figure[] figures  = {new Circle(3), new EquilateralTriangleRight(5), new Triangle(3, 4)};

        for(int i = 0; i < figures.length; i++){
            System.out.println(figures[i].info() + " площадь " + figures[i].area() + " периметр " + figures[i].perimiter() + " ёмкость default " + figures[i].capacityD() + " static " + Figure.capacity(figures[i]));
        }


    }
}
