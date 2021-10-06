import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int fact=1;
        System.out.println("engter the range:");
        int n= sc.nextInt();
        for (int i=1;i<=n;i++)
        {
           fact=fact*i;
        }
        System.out.print(fact+" ");

    }
}