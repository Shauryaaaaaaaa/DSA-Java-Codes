import java.util.*;

public class PrettyPriniting {
    public static void main(String[] args){
        float a = 453.1274f;

        //this floating value will take the value only upto two values.
        System.out.printf("formatted number is %.2f\n", a);

        //the value will print the pi value upto only 2  places:
        System.out.printf("the value of the pi is : %.2f\n", Math.PI);

        System.out.printf("Hello my name is %s and I am %s", "Shaurya", "Cool");
    }
}
