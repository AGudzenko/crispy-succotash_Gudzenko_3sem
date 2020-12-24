package Lambda;

public class PrintableString implements Printable{
    public String str;
    PrintableString(String str){
        this.str = str;
    }
    @Override
    public void print() {
        System.out.println(str);
    }

    public static void main(String[] args) {
        PrintableString ps = new PrintableString("asdf");
        ps.print(); //печатает asdf
    }
}
