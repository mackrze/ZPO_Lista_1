package Lista_1;

import java.security.SecureRandom;
import java.util.Random;

public class Zadanie_5 {
    public static void main(String[] args) {
        Random secureRandom = new SecureRandom();
        int rzuty [] = new int [10];
        float prawdopodobienstwo []=new float [6];
        int rzut;
        for (int i=0;i<10;i++) {
            rzut = 1 + secureRandom.nextInt(6);
            rzuty [i]=rzut;
            prawdopodobienstwo[rzuty [i]-1]+=1;
        }
        for (int i =0;i<prawdopodobienstwo.length;i++){
            prawdopodobienstwo [i]= prawdopodobienstwo [i]/(float)rzuty.length;
        }
        showTableInt(rzuty);
        System.out.println();
        showTableFloat(prawdopodobienstwo);
    }
    public static void showTableInt(int tablica[]){
        for (int i=0;i<tablica.length;i++)
            System.out.print("["+tablica[i]+"] ");
    }
    public static void showTableFloat(float tablica[]){
        for (int i=0;i<tablica.length;i++)
            System.out.print("["+tablica[i]+"] ");
    }

}
