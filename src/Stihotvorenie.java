public class Stihotvorenie {
    public String[] str;
    Stihotvorenie (String[] str) {
        this.str = str;
    }
    public void NaitiRifm() {
        for(int i = 0; i < str.length; i++){
            for (int j = 0; j < str.length; j++){
                if(str[i].substring(str[i].length()-3, str[i].length()-1).equals(str[j].substring(str[j].length()-3, str[j].length()-1)) && i != j ){
                    System.out.print("Строка " + (i+1) + " рифмуется со строкой " + (j+1) + "\n");
                }
            }
        }
    }
}
