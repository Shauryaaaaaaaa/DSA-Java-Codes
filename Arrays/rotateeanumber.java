import java.util.*;

public class rotateeanumber{
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); //jitne ko divide krna hai
        int k = scn.nextInt();//jitne se divide krna hai

        //getting the number of digits
        int temp = n;
        int nod = 0;
         while(temp > 0){
            temp = temp / 10;
            nod++;
         }

         //Handling the negetive rotation of the numbers
         k = k % nod;
         if( k <0){
            k = k + nod;
         }


         int div = 1;
         int mult = 1;
         for(int i = 1; i<=nod; i++){
            if(i <= k){
                div = div * 10;
            }else{
                mult = mult * 10;
            }
         }

         int q = n  / div;
         int r = n % div;
          int rotated = r * mult + q;
          System.out.println(rotated);
    }
}