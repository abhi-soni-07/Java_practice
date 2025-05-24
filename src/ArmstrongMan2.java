//List of Odd and Even Armstrong number

import java.util.Scanner;

public class ArmstrongMan2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        for(int i=1;i<=no;i++) {
            int n = i;
            int count = 0, rem, sum = 0;
            int temp = n;
            while (n > 0) {
                count++;
                n = n / 10;
            }
            n = temp;
            while (n > 0) {
                rem = n % 10;
                sum += (int) (Math.pow(rem, count));
                n = n / 10;
            }
            if (temp%2==0 && temp == sum) {         // For Odd   if(temp%2!=0 && temp==sum)
                System.out.println(temp);
            }
        }
    }
}
