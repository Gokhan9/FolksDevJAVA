package gokhancomert.example1;

import java.util.Scanner;

/*
while döngüsü içerisinde girilen "sum" değeri, 0'a eşit olana kadar "sum" değişkeninde toplama yapıldı..
*/
public class While1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Start Entering Numbers: ");

        int sum = 0;
        int num;

        //int dönüştür, string ara. while içine "boolean" ifade gelebilir, 0 olmadığı  sürece true döndürecek.
        while((num = Integer.parseInt(sc.nextLine())) != 0) {
            sum += num;

            System.out.printf("Sum : %d%n", sum);
        }
    }
}
