import java.util.*;

public class IsPrimeOrNot {
    public static void main(String[] args){
        //Scanner in = new Scanner(System.in);
        //int n = in.nextInt();
        //System.out.println(isPrime(n));
        //System.out.println(isAmstrong(n));


        //getting all the 3 digit amstrong numbers
        for(int i = 100; i<1000; i++){
            if(isAmstrong(i)){
                System.out.println(i + " ");
            }
        }
    }

    //checcking wheather a given number is an amstrontg number or not.
    static boolean isAmstrong(int n){
        int original = n;
        int sum = 0;

        while(n > 0){
            int rem = n % 10; //helps us to get the last digit
            n = n / 10; //whereas this helps to remove the last digit.
            sum = sum + rem*rem*rem;
        }

        return sum == original;
    }

    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }

        int c = 2;
        while(c * c <= n){
            if(n % 2 == 0){
                return false;
            }
            c++;
        }
        if(c*c > n){
            return true;
        }
        return false;
    }
}
