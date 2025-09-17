import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // COMMON ISSUES

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        scanner.nextLine(); // notice this

        System.out.print("Enter your favorire color");
        String color = scanner.nextLine();

        System.out.println("You are " + age + " years old");
        System.out.println("You like the color " + color);

        scanner.close();
    }
}