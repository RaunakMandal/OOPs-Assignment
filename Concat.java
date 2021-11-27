import java.util.Scanner;

class Concat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First name: ");
        String s1 = sc.next();
        System.out.print("Last name: ");
        String s2 = sc.next();
        String s3 = s1 + " " + s2;
        System.out.println("Full name: " + s3);
    }
}