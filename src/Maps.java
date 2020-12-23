import java.io.PrintStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

import static java.lang.Character.*;

public class Maps {
    public static void main(String[] args) throws Exception{
        Character[] rus = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
        String[] eng = {"a", "b", "v", "g", "d", "e", "e", "zh", "z", "i", "i", "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "f", "kh", "ts", "ch", "sh", "shch", "ie", "y", "-", "e", "iu", "ia"};
        Map<Character, String> translitMap = new LinkedHashMap<>();
        createTransliteratorMap(translitMap, rus, eng);
        transliterator(translitMap, "out.txt", "in.txt");

        System.out.println(bananaLetters("banana"));
        System.out.println(bananaIndex("banana"));
        frequencyDictionaryPrintSort("text.txt");
    }

    public static void createTransliteratorMap(Map<Character, String> translit, Character[] rus, String[] eng) {
        for (int i = 0; i < rus.length; i++) {
            translit.put(rus[i], eng[i]);
        }
    }
    public static void transliterator(Map<Character, String> translit, String fileOut, String fileIn) throws Exception {
        String strEng = "";
        Path out = Paths.get(fileOut);
        try (Scanner in = new Scanner(out)) {
            while (in.hasNext()) {
                String str = in.next();
                for (int i = 0; i < str.length(); i++) {
                    if (translit.containsKey(toLowerCase(str.charAt(i)))) {

                        if ((i != str.length() - 1 && isUpperCase(str.charAt(i)) && isUpperCase(str.charAt(i+1))) || (i == str.length() - 1 && isUpperCase(str.charAt(i)))) {
                            strEng += translit.get(toLowerCase(str.charAt(i))).toUpperCase();
                        } else if((str.length() > 1 && isUpperCase(str.charAt(i)) && i != str.length() - 1 && isLowerCase(str.charAt(i+1))) || (str.length() == 1 && isUpperCase(str.charAt(i)))){
                            strEng += toUpperCase(translit.get(toLowerCase(str.charAt(i))).charAt(0)) + translit.get(toLowerCase(str.charAt(i))).substring(1);
                        } else if(isLowerCase(str.charAt(i))) {
                            strEng += translit.get(str.charAt(i));
                        }

                    } else {
                        strEng += str.charAt(i);
                    }
                }
                strEng += " ";
            }
        }

        try (PrintStream o = new PrintStream(fileIn, "utf8")) {
            o.println(strEng);

        }
    }
    public static Map<Character, Integer> bananaLetters(String str) {
        Map<Character, Integer> bananaLettersMap = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (bananaLettersMap.containsKey(str.charAt(i))) {
                bananaLettersMap.put(str.charAt(i), bananaLettersMap.get(str.charAt(i)) + 1);
            } else {
                bananaLettersMap.put(str.charAt(i), 1);
            }

        }
        return bananaLettersMap;
    }
    public static Map<Character, List<Integer>> bananaIndex(String str) {
        Map<Character, List<Integer>> bananaIndexMap = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (bananaIndexMap.containsKey(str.charAt(i))) {
                bananaIndexMap.get(str.charAt(i)).add(i);
            } else {
                List<Integer> b = new ArrayList<>();
                b.add(i);
                bananaIndexMap.put(str.charAt(i), b);

            }
        }
        return bananaIndexMap;
    }
    public static Map<String, Integer> frequencyDictionary (Map<String, Integer> frequencyDictionaryMap, String fileName) throws Exception{
        Path out = Paths.get(fileName);
        try (Scanner in = new Scanner(out)) {
            while(in.hasNext()){
                String str = in.next().toLowerCase();
                if (frequencyDictionaryMap.containsKey(str)) {
                    frequencyDictionaryMap.put(str, frequencyDictionaryMap.get(str) + 1);
                } else {
                    frequencyDictionaryMap.put(str, 1);
                }

            }
        }
        return frequencyDictionaryMap;
    }
    public static void frequencyDictionaryPrintSort(String fileName) throws Exception{
        Map<String, Integer> DictionaryHashMap = new HashMap<>();
        DictionaryHashMap.putAll(frequencyDictionary(DictionaryHashMap, fileName));
        Map<String, Integer> DictionaryTreeMap = new TreeMap<>();
        DictionaryTreeMap.putAll(frequencyDictionary(DictionaryTreeMap, fileName));
        Map<String, Integer> DictionaryLinkedHashMap = new LinkedHashMap<>();
        DictionaryLinkedHashMap.putAll(frequencyDictionary(DictionaryLinkedHashMap, fileName));


        System.out.println(sortMap(DictionaryHashMap));
        System.out.println(sortMap(DictionaryTreeMap));
        System.out.println(sortMap(DictionaryLinkedHashMap));
    }
    public static Map<String, Integer> sortMap(Map<String, Integer> Dictionary){
        // этот способ подглядела в интернете, мне показалось, что это неплохой способ сортировки
        Map<String, Integer> sortedMap = Dictionary.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors
                        .toMap(Map.Entry::getKey,
                                Map.Entry::getValue,
                                (e1, e2) -> e1,
                                LinkedHashMap::new));
        return sortedMap;
    }

}
