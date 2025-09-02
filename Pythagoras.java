
import java.util.*;

public class Pythagoras {
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        //here we find the hypotnus of the triangle -> the biggest side of the traangle
        int max = a;
        if(b > max){
            max = b;
        }
        if(c  > max){
            max = c;
        }

        //checking if the values of the sides satisfy the condition top be true\
        if(max == a){
            boolean flag = ((b*b + c*c) == (a*a));
            System.out.println(flag);
        }else if(max == b){
            boolean flag = ((a*a + c*c) == (b*b));
            System.out.println(flag);
        }else{
            boolean flag = ((a*a + b*b) == (c*c));
            System.out.println(flag);
        }

    }

}
