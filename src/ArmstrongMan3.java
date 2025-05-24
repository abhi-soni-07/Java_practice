//Highest and Lowest Armstrong number within range

import java.util.Scanner;

public class ArmstrongMan3 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int u=sc.nextInt();
        for(int i=l;i<=u;i++)   // for highest Armstrong number for(int i=u;i>=l;i--)
        {
            int n=i;
            int count=0,sum=0,rem;
            int temp=n;
            while(n>0)
            {
                count++;
                n=n/10;
            }
            n=temp;
            while(n>0)
            {
                rem=n%10;
                sum=sum+(int)(Math.pow(rem,count));
                n=n/10;
            }
            if(temp==sum)
            {
                System.out.println(temp);
                return;
            }
        }
    }
}
