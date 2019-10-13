package Lista_1;

import java.util.Scanner;

public class Zadanie_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write your password");
        String password = scanner.nextLine();
        password = password.toUpperCase();
        String newPassword="";
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for (int i = 0; i < alphabet.length; i++)
            alphabet[i] = Character.toUpperCase(alphabet[i]);
        for (int j = 0; j < password.length(); j++) {
            for (int i = 0; i < alphabet.length; i++) {
                if (alphabet[i] == password.charAt(j)) {
                    newPassword += alphabet[i];
                }
            }
        }


        System.out.println(newPassword);

    }

}
