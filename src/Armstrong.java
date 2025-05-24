import java.util.*;

public class Armstrong {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int count=0,rem;
        int sum=0;
        int temp=n;
        while(n>0)
        {
            count++;
            n=n/10;// logic
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
            System.out.println("Armstrong");
        }
        else {
            System.out.println("Not An Armstrong");
        }
    }
}
