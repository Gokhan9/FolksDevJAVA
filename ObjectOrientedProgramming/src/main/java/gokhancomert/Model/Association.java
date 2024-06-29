package gokhancomert.Model;

//Association between both the classes in main method.
public class Association {

    public static void main(String[] args) {

        //ClassName name = new ClassName(parametre)
        //Banka classından yeni bir nesne oluşturuyoruz ve adı "bank" oluyor.

        Bank bank = new Bank("Yapı Kredi");
        Employee emp = new Employee("Gökhan");

        System.out.println(emp.getName() + " is employee of " + bank.name() + " bank. ");
    }
}
