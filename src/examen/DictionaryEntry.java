package examen;

public class DictionaryEntry {
    private String word;
    private String translation;

    DictionaryEntry(String word, String translation){
        this.word = word;
        this.translation = translation;
    }
    public String getWord() {
        return word; // поле name доступно внутри класса `Person`
    }
    public String getTranslation() {
        return translation; // поле name доступно внутри класса `Person`
    }
}
