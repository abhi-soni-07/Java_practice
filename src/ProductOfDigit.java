//Product of nth digit
import java.util.*;
public class ProductOfDigit {
    public static void main(String []args){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number:");
        int n= sc.nextInt();
        int prod=1;
        for(int i=1;i<=n;i++)
        {
            prod=prod*i;
        }
        System.out.println(prod);
    }

}
