import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your favorite color: ");
        String color = input.nextLine();

        System.out.print("Enter your favorite number: ");
        String number = input.nextLine();

        String myValue = color + " " + number;

        System.out.println("\nHere is some random info: " + myValue);
        System.out.println("Your favorite color is: " + color);
    }
}
