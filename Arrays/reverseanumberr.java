import java.util.*;
public class reverseanumberr{

public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    while(n>0){
        int dig = n % 10; //here we will get the remainder
        n = n /10; //we will drop down and cut down the number like from 754 to 75
        System.out.println(dig);
    }
}

}