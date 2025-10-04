import java.util.*;

public class BubbleSort {
    public static void main(String[] args){
        int arr[] = {5,4,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        //we will be taking a boolean for the swapped
        boolean swapped;

        //run the steps n-1 times
        for(int i = 0; i< arr.length; i++){
            swapped = false;
            //for each step, max item will come at the last respective index:
            for(int j = 1; j<arr.length- i; j++){ //We’re using <, not <=, so it stops one before 5 — meaning it checks indices up to 4, which is the last valid index in the array. ✅
                //swap if the item is smaller than the previous item:
                if(arr[j] < arr[j - 1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp; 
                    //if the swap has taken place hence then the swap will occur
                    swapped = true;
                }
            }
            //if you have did not have swap for a perticular value, this means that we can break the program as it is already sorted and the swapped will become false:
            if(!swapped){
                break;
            }
        }
    }
}
