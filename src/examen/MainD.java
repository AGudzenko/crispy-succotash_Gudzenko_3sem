package examen;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainD {
    public static void main(String[] args) throws Exception{

        transletionFile("strict-queries.txt", "otvet.txt", readFile("dictionary.txt"));
        transletionFile2("strict-queries.txt", "otvet2.txt", readFile("dictionary.txt"));

    }
    public static List<DictionaryEntry> readFile(String fileName) throws Exception{
        List<DictionaryEntry> b = new ArrayList<>();
        String[] words;

        Path out = Paths.get(fileName);
        try (Scanner in = new Scanner(out)) {
            while (in.hasNextLine()) {
                words = in.nextLine().split(" ", 2);
                b.add(new DictionaryEntry(words[0], words[1]));

            }
        }catch (IOException e) {
            System.out.println("errooooorrr");
        }
        //System.out.println(b);
        return b;

    }
    public static void writeFile(String fileName, String otvetListt) throws Exception{
        try (FileWriter out = new FileWriter(fileName, true)) {
            out.write(otvetListt);
            out.flush();
            out.close();
        }

    }
    public static void transletionFile(String infileName, String outfileName,  List<DictionaryEntry> b) throws Exception{
        String str = " ";
        String otvet = "";

        Path out = Paths.get(infileName);
        try (Scanner in = new Scanner(out)) {
            while (in.hasNextLine()) {
                str = in.nextLine();

                for(DictionaryEntry a : b){
                    if(a.getWord().equals(str.toUpperCase())){
                        otvet = "Запрос: " + a.getWord() +  "\nНайдено: " + a.getTranslation() + " \n";
                        writeFile(outfileName, otvet);
                    }
                }
            }

        }catch (IOException e) {
            System.out.println("errooooorrr");
        }
    }

    public static void transletionFile2(String infileName, String outfileName,  List<DictionaryEntry> b) throws Exception{
        String str = " ";
        String otvet = "";


        Path out = Paths.get(infileName);
        try (Scanner in = new Scanner(out)) {
            while (in.hasNextLine()) {
                str = in.nextLine();

                for(DictionaryEntry a : b){
                    if(a.getWord().contains(str.toUpperCase())){
                        otvet = "Запрос: " + a.getWord() +  "\nНайдено: " + a.getTranslation() + " \n";
                        writeFile(outfileName, otvet);
                    }
                }
            }
        }catch (IOException e) {
            System.out.println("errooooorrr");
        }
    }

}
