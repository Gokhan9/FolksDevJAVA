package gokhancomert.TypeCasting;

public class TypeCasting {
    public static void main(String[] args) {

        //Tür Dönüşümleri

        //1. Primitive to Primivite
            //1.1 Widening(no cast) (byte-> short-> int-> long-> float-> double)

        int i0=10;
        double d0=i0;
        System.out.println(d0);

            //1.2 Narrowing(necessary cast) (byte <-short <-char <-int <-long <-float <-double)

        double d2=2.3;
        int i2 = (int) d2; //<- int i2=d2; hata verir ve solda ki işleme cast eder.
        System.out.println(i2);

        float f3=56f;
        char c3 = (char) f3;     // <- char c3=f3; hata verir ve solda ki işleme cast eder.
        System.out.println(c3);

        int fahrenheit = 100;
        int celcius = (int)((fahrenheit) * 5.0 / 9.0);
        System.out.println(celcius);

        //Integer bir değeri "String.valueOf" metodunu kullanarak çıktı elde ettik.
        int i5 = 20;
        String str5 = String.valueOf(i5);
        System.out.println(str5);

        //Integer bir değeri "Integer.toString" metodunu kullanarak çıktı elde ettik.
        int i6 = 1903;
        String str6 = Integer.toString(i6);
        System.out.println(str6);

        //String bir değeri "Integer.parseInt" metodunu kullanarak çıktı elde ettik.
        String s7 = "1907";
        int i7 = Integer.parseInt(s7);
        System.out.println(i7);

        //String bir değeri "Integer.valueOf" metodunu kullanarak çıktı elde ettik.
        String s8 = "1999";
        int i8 = Integer.valueOf(s8);
        System.out.println(i8);
    }
}
