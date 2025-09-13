import java.util.*;
public class Main{
    public static void main(String[] args){
        int x = 10;
        int y =20;
        int sum = x + y;
        System.out.println("The sum is:" + sum);
        int prd = x * y;
        System.out.println("The product of the numbers is " + prd);
        int v1 = x / y; // whenever in java we didvide two numbers we always get the quotient value 
        int v2 = y/ x;
        int v3 = x % y; // whereas for modulo we always get the remainder value
        System.out.println("the value of v1 is: " + v1 + ", The value of v2 is: " + v2 + ", The value of v3 is: " + v3);

        
        // Checking the even and odd values:
        int e = 10;
        if(e%2 == 0){
            System.out.println(e + " is an even number");
        }
        else{
            System.out.println(e + " is an odd number");
        }

        System.out.println("Hardwork once will compound to great success in the long run");


        int g = 20;
        int h = 30;

        if(g == h){
            System.out.println("g is greater than h");
        }
        else if(g > h){
            System.out.println(g + " is greater than " + h);
        }
        else{
            System.out.println(g + " is smaller than " + h);
        }
    }
}
 