class KPrime 
{
    public static boolean isPrime (int n)
    {
        boolean r=true;
        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0)
                r=false;
        return r;
    }
    public static void main(String[] args) 
    {
        int count=0;
        for(int i=2;count<10;i++)
        {
            if(isPrime(i))
            {
                count++;
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
