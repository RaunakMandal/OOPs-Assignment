
// 13. Write a program in Java to check a number is armstrong or not.

import java.util.*;
import java.lang.Math;
public class armstrong{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n,c,sum=0,r;
        System.out.println("enter the number");
        n=sc.nextInt();
        int temp=n,count=0;
        while(temp!=0){
            count++;
            temp/=10;
        }
        c=n;
        while(n!=0)
        {
            r=n%10;
            n=n/10;

            int a= (int)Math.pow(r,count);
            sum=sum+(a);
        }
        if(c==sum)
            System.out.println("it is armstrong");
        else
            System.out.println("it is not armstrong"); 
    }
}