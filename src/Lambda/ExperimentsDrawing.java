package Lambda;

public class ExperimentsDrawing {
    public static void main(String[] args) {
        Drawing d1 = new Drawing(5,5,'.');
        Drawing d2 = new Drawing(5,3, '+');
//        d1.print();
        d1.setPoint(2,3,'q');
        //d1.drawVerticalLine(1,3,2,'-');
        //d2.drawHorizontalLine(1,3,2,'-');
        //d1.print();
        //d2.drawRectangle(1,3,1,3,'+');
//        d1.draw(2, 1, d2);
//        d1.print();
//        System.out.println("////////////////");
//        d2.print();

        Printable a = new Drawing(5,5,'o');
//        a.print();

    }
}