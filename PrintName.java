
// Kabirul Hassan
// input your name and print it using scanner class
import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Your name is: " + name);
        sc.close();
    }
}
