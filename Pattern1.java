public class Pattern1 
{
    public static void main(String[] args) 
    {
        int n = Integer.parseInt(args[0]);
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
