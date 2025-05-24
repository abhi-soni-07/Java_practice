//Addition of 2 numbers
import java.util.Scanner;

public class Addition {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a and b");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= a+b;
        System.out.println("Addition of a and b is = "+c);

    }

}
