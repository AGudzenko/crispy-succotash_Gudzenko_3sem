package Lambda;

public class PrintableLetter implements Printable{

    public String s;
    public int nums;
    PrintableLetter(String s, int nums){
        this.nums = nums;
        this.s = s;
    }
    @Override
    public void print() {
        for(int i = 0; i < nums; i++){
            System.out.print(s);
        }
    }

    public static void main(String[] args) {

        PrintableLetter pl = new PrintableLetter("x", 10);
        pl.print(); //печатает букву x 10 раз
    }
}
