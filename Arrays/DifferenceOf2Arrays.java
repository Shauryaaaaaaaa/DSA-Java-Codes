import java.util.*;

public class DifferenceOf2Arrays {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int[] a1 = new int[n1];
        for(int i = 0; i<a1.length; i++){
            a1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] a2 = new int[n2];
        for(int i  = 0; i< a2.length; i++){
            a2[i] = scn.nextInt();
        }

        int[] diff = new int[n2];
        int carry = 0;

        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = diff.length - 1;

        while(k >= 0){
            int d = 0;
            int a1v = i >= 0? a1[i] : 0; // if i is valid index then take a1[i] else 0

            if(a2[j] + carry >= a1v){
                d = a2[j] + carry - a1v;
                carry = 0;
            }else{
                d = a2[j] + carry + 10 - a1v;
                carry = -1;
            }

            diff[k] = d;
             
            i--;
            j--;
            k--;
        }

        //while printing how we ignore the trailing zerores
        int idx = 0;
        while(idx < diff.length){
            if(diff[idx] == 0){
                idx++;
            }else{
                break; //that is the point where we found that we have got the numbers 
            }
        }

        //now we print the numbers that are after the trailing zeroes
        while(idx < diff.length){
            System.out.println(diff[idx]);
            idx++;
        }
    }
}
