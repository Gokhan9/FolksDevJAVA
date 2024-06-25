import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        System.out.println("Hello World");
        System.out.println(3+5);
        System.out.println("5 x 4 = " +(5*4));
        System.out.println("I'm " + 25 + " years old.");
        System.out.println("Naber");
        System.out.println("iyidir");
        System.out.print("Deneme 1\n");
        System.out.print("Deneme 2\n");
        System.out.print("Deneme 3");//ln - line - altsatıra geçmesini sağlar veya ("naber\n" ln görevi görür)
        System.out.println(" Deneme 4\n");

        System.out.println("Byte: "+Byte.MAX_VALUE);
        System.out.println("Int: "+Integer.MAX_VALUE);
        System.out.println("Long: "+Long.MAX_VALUE);
        System.out.println("Float: "+Float.MAX_VALUE);*\
         */

        /*
        DEĞİŞKEN ATAMALAR

        int x = 5;
        float pi = 3.141596f;
        short y = 120;
        String name = "robert";
        System.out.println(name);
        name = "lewa";
        System.out.println(name);
         */

        /*
        DOĞRU KULLANIMLAR

        int yas = 25;                    // ADLANDIRMALARI
        String kullaniciAdi = "Gökhan"; //camelcase - kullaniciAdi
        float PiSayisi = 3.14f; //pascalcase - PiSayisi
        double KDV_ORANI = 0.5; //sneakcase - KDV_ORANI
         */

        /*
        KULLANICIDAN VERİ ALMAK

        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        System.out.println("Nasılsın " + name);

        int saat = scanner.nextInt();
        System.out.println("Şuan saat: "+ saat);
        */

        /*
        int numberOne = 25;
        int numberTwo = 35;
        System.out.println(numberOne+numberTwo);
        System.out.println(numberOne-numberTwo);
        System.out.println(numberOne*numberTwo);
        numberOne += 10; // numberOne++; -Aralarında ki fark "+= 10;" yazabiliriz ama "++;" kullanırsak sadece 1 arttırır.
        numberOne ++;
        System.out.println(numberOne);
        numberTwo -= 6; // numberTwo--; -Aralarında ki fark "-= 6;" yazarız ve 15 azaltırız. "--;" kullansak 1 eksiltebiliriz.
        numberTwo --;
        System.out.println(numberTwo);

         */

        // = ATAMA, + TOPLAMA, - ÇIKARMA, * ÇARPMA, / BÖLME, % MODÜL, ++ 1 ARTTIR, -- 1 EKSİLT.

        // == EŞİTLİK KONTROL, != EŞİT DEĞİL, > BÜYÜKTÜR, < KÜÇÜKTÜR, >= BÜYÜKSE yada EŞİTSE(true), <= KÜÇÜKSE yada EŞİTSE(true).

        // &&(Ve ifadesi) HER 2 ŞART DOĞRUYSA, TRUE DÖNER.  || (veya ifadesi) ŞARTLARDAN BİRİ GEÇERLİYSE, TRUE DÖNER. !(değil ifadesi) TRUE ise FALSE, False ise true


        // if else şart

        /*
        int a = 10;
        int b = 5;
        int c = 12;

        if (a > b) {
            System.out.println("a, b'den büyük");
        }
        if (b < c){
            System.out.println("b, c'den küçük");
        }

        int aA = 15;
        int bA = 15;

        if(aA == bA){
            System.out.println("Eşit");
        } else if (aA > bA) {
            System.out.println("Büyüktür.");
        } else if (aA < bA) {
            System.out.println("Küçüktür.");
        }

        int number = -5;

        if (number == 0) {
            System.out.println("eşit");
        } else if (number > 0) {
            System.out.println("büyüktür");
        } else if (number < 0) {
            System.out.println("küçüktür.");
        }

        int yas = 18;

        if (yas >= 18) {
            System.out.println("reşitsiniz");
        }else {
            System.out.println("reşit değilsiniz....");
        }

        Scanner scanner = new Scanner(System.in);

        int myNot = scanner.nextInt();

        if (myNot >= 90) {
            System.out.println("AA");
        } else if (myNot >= 70) {
            System.out.println("BA");
        } else if (myNot >= 50) {
            System.out.println("BB");
        } else if (myNot >= 40) {
            System.out.println("CB");
        } else {
            System.out.println("Kaldınız.");
        }

        int n1=5, n2=15, n3=7;
        if(n1 >= n3 && n2 >= n1){
            System.out.println("n2, büyüktür ");
        } else if (n2 >= n3 && n3 >= n1){
            System.out.println("2 şartta sağlandı ve sonucu verdi");
        }
        */

        /*

        //Switch-case


        Scanner scanner = new Scanner(System.in);

        System.out.println("İstediğiniz günü girin:");
        int gunSayisi = scanner.nextInt();

        switch (gunSayisi)       //günsayısı, 1'e eşit mi?
        {
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("çarşamba");
                break;
            case 4:
                System.out.println("perşembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("Geçersiz");
                break;
        }

        String colour = "red";
        switch (colour) {
            case "red":
                System.out.println("Dur");
                break;
            case "yellow":
                System.out.println("hazırlan");
                break;
            case "green":
                System.out.println("geç");
                break;
            default:
                System.out.println("Girdiğiniz renk tanımlı değil.");
        }


        System.out.println("Renk giriniz");
        String color = scanner.next();
        switch (color) {
            case "red":
                System.out.println("Dur");
                break;
            case "yellow":
                System.out.println("hazırlan");
                break;
            case "green":
                System.out.println("geç");
                break;
            default:
                System.out.println("Girdiğiniz renk tanımlı değil.");
        }


        int sayi1,sayi2;
        String islem;

        System.out.println("1.sayı:");
        sayi1 = scanner.nextInt();

        System.out.println("2.sayı:");
        sayi2 = scanner.nextInt();

        System.out.println("+ - * /");
        islem = scanner.next();

        switch (islem)
        {
            case "+":
                System.out.println(sayi1 + islem + sayi2 + "=" + (sayi1+sayi2));
                break;
            case "-":
                System.out.println(sayi1 + islem + sayi2 + "=" + (sayi1-sayi2));
                break;
            case "*":
                System.out.println(sayi1 + islem + sayi2 + "=" + (sayi1*sayi2));
                break;
            case "/":
                System.out.println(sayi1 + islem + sayi2 + "=" + (sayi1/sayi2));
                break;
            default:
                System.out.println("Bilmediğim işlemi girdin.");

         */



        //Java methodlar. void:geriye değer dönmez. return:geriye değer döner
        /*public class Main {
            public static void main(String[] args) {*/

        Scanner sc = new Scanner(System.in);


            sayHello();
            showPi();
            writeMessage("Gökhan ");

            int sonuc = topla(5, 10);
        System.out.println(sonuc);

        int sonuc1 = carp(10,20);
            System.out.println(sonuc1);

            int sonuc2 = cikarma(50, 10);
            System.out.println(sonuc2);

        System.out.println(carp(200));

        int age = sc.nextInt();
        System.out.println(isUnderAge(age));


    }

    //metods süslü parantez altına yazılır.
    // çağırırken yukarıdan çağırırız.

    static boolean isUnderAge(int age) {
        if (age >= 18) {
            return true;
        }else{
            return false;
        }
    }

    static int topla(int a, int b) {
        return a + b;
    }
    static int carp(int c, int d) {
        return c * d;
    }
    static int cikarma(int sayi1, int sayi2) {
        return sayi1 - sayi2;
    }

    static int carp(int sayi1) {
        int sonuc3 = sayi1 * sayi1 ;
        return sonuc3;
    }



    static void writeMessage(String msg) {
        System.out.println(msg);
    }
    static void showPi(){
        System.out.println(3.14);
    }
    static void sayHello(){
        System.out.println("Hello World");
    }
}


