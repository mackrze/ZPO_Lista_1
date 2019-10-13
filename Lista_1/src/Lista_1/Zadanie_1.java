package Lista_1;

import java.util.Scanner;

public class Zadanie_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write value of income");
        String valueString = scanner.nextLine();
        double[] tableOfValues = {11000,18000,31000,60000,90000,1000000};
        double[] tableOfTax = {0,25,35,42,48,50,55};
        double value = Double.parseDouble(valueString);
        double tax=0;
        for (int i=0; i<6;i++){
            if (value<=tableOfValues[i]){
                tax=value*tableOfTax[i]/100;
                break;
            }}
        if (tax==0 && value>11000)
            tax=value*tableOfTax[6]/100;
        System.out.println("Value of tax is: "+tax);

    }

}
