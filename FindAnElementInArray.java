import java.util.*;
public class FindAnElementInArray {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }

        int data = scn.nextInt(); // data that has to be find

        int indx = -1; 
        for(int i  =0 ;i < arr.length; i++){
            if(arr[i] == data){
                indx = i;
                break;
            }
        }
        System.out.println(indx);
    }
}
