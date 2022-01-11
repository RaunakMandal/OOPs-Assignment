import java.util.Scanner;

public class ChickenRabbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of heads: ");
        int heads = sc.nextInt();
        System.out.print("Enter number of legs: ");
        int legs = sc.nextInt();

        if (legs % 2 != 0 || heads == 0 || heads > legs) {
            System.out.println("Can not find number of chickens or rabbits.");
        } else {
            int rabbit = ((legs + (-2 * heads)) / 2);
            System.out.println("Chicken: " + (heads - rabbit));
            System.out.println("Rabbit: " + rabbit);
        }
        sc.close();
    }
}