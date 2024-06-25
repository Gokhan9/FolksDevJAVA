package gokhancomert.example2;

import java.util.Scanner;

/*
while ile pozitif-negatif sayıların ayrı ayrı toplanması
 */
public class While2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num;
        int positiveSum = 0;
        int negativeSum = 0;

        while((num = Integer.parseInt(sc.nextLine())) !=0) {

            if(num > 0)
                positiveSum += num;
            else
                negativeSum += num;

            displayResult(positiveSum, negativeSum);

        }
    }

    public static void displayResult(int positiveSum, int negativeSum){
        if(positiveSum > 0)
            System.out.printf("Sum of positive number is: %d%n", positiveSum);
        else
            System.out.println("You didn't enter positive numbers!");

        if(negativeSum < 0)
            System.out.printf("Sum of negative number is: %d%n", negativeSum);
        else
            System.out.println("You didn't enter negative numbers!");
    }
}
