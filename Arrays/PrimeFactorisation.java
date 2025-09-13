import java.util.*;

public class PrimeFactorisation {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();

        for(int div = 2; div*div < n; div++){ // the div changes if the values given is not able to be divided from the present div 
            while(n % div == 0){  //intiallly we kept the divisor at 2 as it is the least from which we can divide 
                n = n / div; // n is the value from which we divide and get the divisor printed  
                System.out.println(div);
            }
        }
        if( n!= 1){
            System.out.println(n); // in the case of 46 the prime factors are 2 and 23 hence after 2 we will not fdivide the 
            // the number with the further any number we will quit the loop and print that number.
        }
    }
}
