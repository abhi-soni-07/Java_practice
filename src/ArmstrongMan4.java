//Even, Odd and for every 3rd position Armstrong number

import java.util.Scanner;

public class ArmstrongMan4 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int pos = 0;                            //imp
        for (int i = 1; i <= no; i++) {
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

            if (temp == sum) {
                pos++;
                if (pos % 2==0) {                       // for odd if(pos %2!=0)
                    System.out.println(temp);           // for every 3 Armstrong number if(pos%3==0)
                }
            }
        }
    }
}




