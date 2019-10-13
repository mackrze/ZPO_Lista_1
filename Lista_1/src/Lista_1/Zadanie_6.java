package Lista_1;

import java.security.SecureRandom;
import java.util.Random;

public class Zadanie_6 {
    public static void main(String[] args) {
        Random secureRandom = new SecureRandom();
        int table [][]=new int [2][2];
        int sum=0;
        for (int i=0;i<table.length;i++){
            for (int j=0;j<table[i].length;j++){
                table[i][j]= secureRandom.nextInt(5-(-10)+1)+(-5);
                if(i==j)
                    sum+=table[i][j];
            }
        }
drukujTablice2D(table);
        System.out.println("Suma wynosi: "+sum);

    }
    public static void drukujTablice2D (int  table [][]) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print("["+table[i][j]+"] ");
            }
            System.out.println();
        }
    }
}
