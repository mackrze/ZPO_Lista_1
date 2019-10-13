package Lista_1;

public class Zadanie_7 {
    public static void main(String[] args) {
        int table[][] = new int[4][4];
        for (int i = 0; i < table.length; i++) {  //nr rzędu
            for (int j = 0; j < table[i].length; j++) {  //nr kolumny
if (i+1==j)
    table[i][j]=1;
else
    table[i][j]=0;
            }
        }
        Zadanie_6.drukujTablice2D(table);
        System.out.println();
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (j==1)
                    table[i][j]=1;
                else
                    table[i][j]=0;
            }
        }
        Zadanie_6.drukujTablice2D(table);
        System.out.println();
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i].length-i-1==j)
                    table[i][j]=1;
                else
                    table[i][j]=0;
            }
        }
        Zadanie_6.drukujTablice2D(table);
        System.out.println();

    }
}
