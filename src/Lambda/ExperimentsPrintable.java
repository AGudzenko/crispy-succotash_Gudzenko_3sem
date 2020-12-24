package Lambda;

public class ExperimentsPrintable {
    public static void main(String[] args) {
        Printable printableAnonim = new Printable() {
            @Override
            public void print() {
                System.out.print("я анонимный класс");
            }
        };
        Printable printableLamda = () -> System.out.println("я лямбда выражение");

        Printable[] printables = {new Drawing(5,5,'o'), new PrintableLetter("x", 10), new PrintableString("hahaha"), printableAnonim, printableLamda };
        for(int i = 0; i < printables.length; i++){
            printables[i].print();
            System.out.println("\n");
        }
    }
}
