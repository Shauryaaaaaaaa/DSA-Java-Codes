import java.util.*;

public class geradingSystem{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int marks = scn.nextInt();

        if(marks > 90){
            System.out.println("Excellent");
        }else if(marks > 80){
            System.out.println("Excellent");
        }else if(marks > 70){
            System.out.println("Average Student");
        }else if(marks >40){
            System.out.println("Boderline");
        }else{
            System.out.println("Fail");
        }
    }
}