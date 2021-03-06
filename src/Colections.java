import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Colections {
    public static void main(String[] args) throws Exception{
        List<String> a = new ArrayList<>();
        List<String> b = new ArrayList<>();
        a.add("4");
        a.add("bbb20");
        a.add("ccc30");
        b.add("lalala");

        List<String> qq = new ArrayList<>();
        qq.add("aaa4");
        qq.add("3");
        qq.add("6");
        qq.add("a7");
        print(qq);
        List<Integer> a_i = new ArrayList<>(zad1());
        System.out.println("1");
        System.out.println(zad1());
        System.out.println("2");
        zad2(a, b);
        System.out.println(a);
        System.out.println("4.2");
        System.out.println(zad42(a));
        System.out.println(a);
        System.out.println("4.1");
        zad41(a);
        System.out.println(a);
        System.out.println("5.1.2");
        System.out.println(zad5_1_2(a));
        System.out.println("5.1.1");
        zad5_1_1(a);
        System.out.println(a);

        System.out.println("5.2.2");
        System.out.println(zad5_2_2(qq));
        System.out.println("5.2.1");
        zad5_2_1(qq);
        System.out.println(qq);

        System.out.println("5.3.2");
        System.out.println(a_i);
        System.out.println(zad5_3_2(a_i));
        System.out.println("5.3.1");
        zad5_3_1(a_i);
        System.out.println(a_i);
        System.out.println("");
        zad6("text.txt");


    }
    public static void print(List<String> a){
        System.out.println("Элементов в списке: " + a.size());
        for(String i : a)
            System.out.println(i);
    }
    public static void printIndex(List<String> a){
        System.out.println("Элементов в списке: " + a.size());
        for(int i = 0; i < a.size(); i++)
            System.out.println(i + ": " + a.get(i));
    }
    public static List<Integer> zad1(){
        List<Integer> a = new ArrayList<>();
        for(int i = 1; i<=100; i++){
            a.add(i);
        }
        return a;
    }
    public static List<String> zad2(List<String> a, List<String> b){
        List<String> new_list = new ArrayList<>(a);
        new_list.addAll(b);
        return new_list;
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
            if(i % 2 == 0 ){
                a.set(i, "*");
            }
        }
        for(int i = 0; i < a.size(); i++){
            if(a.get(i) == "*" ){
                a.remove(i);
            }
        }

    }
    public static List<String> zad5_1_2(List<String> a){
        List<String> b = new ArrayList<>(a);
        for(int i = 0; i < b.size(); i++){
            if(i % 2 == 0 ){
                b.set(i, "*");
            }
        }
        for(int i = 0; i < b.size(); i++){
            if(b.get(i) == "*" ){
                b.remove(i);
            }
        }
        return b;
    }
    public static void zad5_2_1(List<String> a){
        for(int i = 0; i < a.size(); i++){
            if(a.get(i).matches("(?![^\\d])\\d*[24680](?![a-zA-Z])(?![.,]?\\d)")){
                a.remove(i);
            }
        }
    }
    public static List<String> zad5_2_2(List<String> a){
        List<String> b = new ArrayList<>(a);
        for(int i = 0; i < b.size(); i++){
            if(b.get(i).matches("(?![^\\d])\\d*[24680](?![a-zA-Z])(?![.,]?\\d)")){
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
    public static void zad6(String fileName) throws Exception{
        HashSet<String> hashSetFile = new HashSet<>();
        TreeSet<String> treeSetFile = new TreeSet<>();
        LinkedHashSet<String> linkedHashSetFile = new LinkedHashSet<>();
        Path out = Paths.get(fileName);
        try (Scanner in = new Scanner(out)) {
            while(in.hasNext()){
                String str = in.next().toLowerCase();
                hashSetFile.add(str);
                treeSetFile.add(str);
                linkedHashSetFile.add(str);
            }
        }
        System.out.println(hashSetFile);
        System.out.println(treeSetFile);
        System.out.println(linkedHashSetFile);
    }
}
