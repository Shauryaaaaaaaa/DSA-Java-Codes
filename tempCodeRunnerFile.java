import java.util.*;

public class GCDandLCM{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int originalN1 = n1;
        int originalN2 = n2;

        //HERE WE FIND THE GCD:
         while(n1 % n2 != 0){
            int rem = n1 % n2; 
            // n1 was divided with n2 giving out a remainder and further the remainder changes to n2 and the n2 becomes n1 to  be divided
            n1 = n2;
            n2 = rem;
         }

            int gcd = n2;
            int lcm = (originalN1 * originalN2) / gcd;
            System.out.println(gcd);
            System.out.println(lcm);
    }

}