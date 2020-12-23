import java.util.Arrays;

public class Stihotvorenie {
    public String[] str;
    public char[] glasn = {'a', 'о', 'э', 'е', 'и', 'ы', 'у', 'ё', 'ю', 'я'};
    public char[] zn_prep = {',', '.', '!', '?'};

    Stihotvorenie (String[] str) {
        this.str = str;
    }
    public void NaitiRifm() {
        int schet = 1;
        int otschet = 0;
        for(int i = 0; i < str.length; i++){
            for(int k = str[i].length()-schet; k >= 0; k--){
                if(Arrays.asList(glasn).contains(str[i].charAt(k))){
                    otschet = k;
                }
            }
            for (int j = 0; j < str.length; j++){
                if(Arrays.asList(zn_prep).contains(str[i].charAt(str[i].length()-1))){
                    schet++;
                }

                if(str[i].substring(str[i].length()-otschet, str[i].length()-1).equals(str[j].substring(str[j].length()-otschet, str[j].length()-1)) && i != j ){
                    System.out.print("Строка " + (i+1) + " рифмуется со строкой " + (j+1) + "\n");
                }
            }
        }
    }
}
