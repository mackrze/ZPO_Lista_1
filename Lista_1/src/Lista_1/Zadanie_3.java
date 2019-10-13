package Lista_1;

import java.util.Scanner;

public class Zadanie_3 {
    public static void main(String[] args) {
        System.out.println("Please write a sentence ");
        swinskaLacina();
    }
    public static void swinskaLacina(){
        Scanner scanner = new Scanner(System.in);
        String string=scanner.nextLine();
        string.replace(',','\\');
        string.replace('.','\\');
        String [] parts = string.split(" ");
        for (int i=0;i<parts.length;i++){
            StringBuilder stringBuilder =new StringBuilder();
            stringBuilder.append(parts[i]);
            if (Character.isUpperCase(parts[i].charAt(0))) {
                System.out.print(parts[i] + " ");
                continue;
            }
            if (parts[i].charAt(0)=='a'||parts[i].charAt(0)=='e'||parts[i].charAt(0)=='i'||parts[i].charAt(0)=='o'||parts[i].charAt(0)=='u'){
                stringBuilder.append("way");
                parts[i]=stringBuilder.toString();
            }
            else {
                stringBuilder.append("ay");
                parts[i] = stringBuilder.toString();
            }
            System.out.print(parts[i]+" ");

        }


    }
}
