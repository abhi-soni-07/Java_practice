//Swapping without using 3rd variable

import java.util.*;

public class Swapping2 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a");
        int a=sc.nextInt();
        System.out.println("Enter b");
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }


}
