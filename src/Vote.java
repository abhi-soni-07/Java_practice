import java.util.*;
public class Vote {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int n=sc.nextInt();
        if (n>=18)
        {
            System.out.println("Eligible to vote");
        }
        else {
            {
                System.out.println("Not Eligible to vote");
            }
        }
    }
}
