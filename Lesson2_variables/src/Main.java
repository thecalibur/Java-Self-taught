//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int age = 21;
        int year = 2025;

        double price = 19.99;
        double gpa = 3.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        String name = "Bro Bill";
        String food = "pizza";
        String email = "hungtri1906@gmail.com";
        String car = "Mustang";
        String color = "red";

        System.out.println(age);
        System.out.println("The year is: " + year);

        System.out.println("Hello " + name);
        System.out.println("Your favourite food is " + food);
        System.out.println("You age " + age + " years old");
        System.out.println("Your GPA is " + gpa);
        System.out.println("Your choice is " + color + " " + year + " " + car);

        System.out.println("The price is: " + currency + price);

//        if(isStudent) {
//            System.out.println("You are a student!");
//        } else {
//            System.out.println("You are not a student!");
//        }

        if (forSale) {
            System.out.println("There is a " + car + " for sale");
        } else {
            System.out.println("The " + car + " is not for sale");
        }
    }
}