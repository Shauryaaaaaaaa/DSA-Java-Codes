import java.util.*;
 public class inversee{

public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int inv = 0;
    int  op = 1; // original position 

    while(n > 0){
        int od = n % 10; // original digit
        int id = op; // inverse digit
        int ip = od; // inverse position

        //make the changes to inv using ip and id
       inv = inv + id * (int)Math.pow(10, ip - 1);


        n = n/10;
        op++;
    }

    System.out.println(inv);
}

 }