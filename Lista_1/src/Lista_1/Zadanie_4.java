package Lista_1;

import java.util.Scanner;

public class Zadanie_4 {
    public static void main(String[] args) {
        System.out.println("Proszę wprowadzić wzór i nazwę po przecinku ");
        wzorSumaryczny();
    }
    public static void wzorSumaryczny(){
        int symboleIlosc []=new int[6];//tablica ilosci pierwiastkow kolejno H C O N P S
        for (int i=0;i<6;i++)
            symboleIlosc[i]=0;
        char symboleZnak [] =new char []{'H','C','O','N','P','S'};
        Scanner scanner = new Scanner(System.in);
        String pierwiastek = scanner.nextLine();
        String [] parts = pierwiastek.split(",");
        String wzor= parts[0];
        wzor=wzor.toUpperCase();
       // System.out.println(wzor);
        for (int i=0;i<wzor.length();i++) {
            for (int j = 0; j < symboleZnak.length; j++) {
                if (wzor.charAt(i)== symboleZnak[j])
                    symboleIlosc[j] += 1;
            }
        }
        StringBuilder stringBuilder =new StringBuilder();
        for (int i=0;i<symboleZnak.length;i++){
            stringBuilder.append(symboleZnak[i]);
            stringBuilder.append(symboleIlosc[i]);
        }
        System.out.println(stringBuilder.toString()+","+parts [1]);


    }

}
