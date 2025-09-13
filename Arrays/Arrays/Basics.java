
import java.util.*;

public class Basics{

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) throws Exception{
        //code from here
        int[] arr;
        arr = new int[5];
        //these both can also be written as int[] arr = new int[5]
        arr[0] = 33;
        arr[1] = 34;
        arr[2] = 56;
        arr[3] = 66;
        arr[4] = 87;

        int[] two = arr; //recieved one array in two.
        two[2] = 200;

        swap(arr, 0 , 4);

        for(int i = 0; i<two.length; i++){
            System.out.println(two[i]);
        }
        
    }
}