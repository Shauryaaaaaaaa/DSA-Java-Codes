import java.util.*;

public class countanumber{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nod = 0; // nod stands for number of digits
         int temp = n;

         //this will count the number of digits present in n 
         while(temp != 0){
            temp = temp / 10;
            nod++;//this will count the number of times the division of the number takes place
         }

         //creates a divisor like 1000,100,10... based on the digits
         int div = (int)Math.pow(10, nod - 1);

         //this will extract digits one by one from left to right
         while(div != 0){
            int q = n / div; //this will give the leftmost digit from the number 
            System.out.println(q);

            n = n % div; //removes the digit from number
            div = div / 10; // move to next digit place
         }
    }
}