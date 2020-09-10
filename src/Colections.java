import java.util.ArrayList;
import java.util.List;

public class Colections {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        List<String> b = new ArrayList<>();
        a.add("4");
        a.add("bbb20");
        a.add("ccc30");
        b.add("lalala");

        List<Integer> a_i = new ArrayList<>(zad1());

        System.out.println(zad1());
        zad2(a, b);
        System.out.println(a);
        System.out.println(zad42(a));
        System.out.println(a);
        zad41(a);
        System.out.println(a);
        System.out.println(zad5_1_2(a));
        zad5_1_1(a);
        System.out.println(a);


        System.out.println(a_i);
        System.out.println(zad5_3_2(a_i));
        zad5_3_1(a_i);
        System.out.println(a_i);

    }
    public static List<Integer> zad1(){
        List<Integer> a = new ArrayList<>();
        for(int i = 1; i<=100; i++){
            a.add(i);
        }
        return a;
    }
    public static void zad2(List<String> a, List<String> b){
        a.addAll(b);
    }
    public static void zad41(List<String> a){
        List<String> b = new ArrayList<>();
        for(int i = a.size() - 1; i >= 0; i--){
            b.add(a.get(i));
        }
        a.clear();
        a.addAll(b);
    }
    public static List<String> zad42(List<String> a){
        List<String> b = new ArrayList<>();
        for(int i = a.size() - 1; i >= 0; i--){
            b.add(a.get(i));
        }
        return b;
    }
    public static void zad5_1_1(List<String> a){
        for(int i = 0; i < a.size(); i++){
            if(i % 2 == 0 && i != 0){
                a.remove(i);
            }
        }
    }
    public static List<String> zad5_1_2(List<String> a){
        List<String> b = new ArrayList<>(a);
        for(int i = 0; i < a.size(); i++){
            if(i % 2 == 0 && i != 0){
                b.remove(i);
            }
        }
        return b;
    }
    public static void zad5_3_1(List<Integer> a){
        for(int i = 0; i < a.size(); i++){
            if(a.get(i) % 2 == 0 && i != 0){
                a.remove(i);
            }
        }
    }
    public static List<Integer> zad5_3_2(List<Integer> a){
        List<Integer> b = new ArrayList<>(a);
        for(int i = 0; i < b.size(); i++){
            if(b.get(i) % 2 == 0 && i != 0){
                b.remove(i);
            }
        }
        return b;
    }
}
