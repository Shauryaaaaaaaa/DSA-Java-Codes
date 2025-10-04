import java.util.*;

public class SelectionSort {
    public static void main(String[] args){
        int arr[] = {3,1,5,4,2};
        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Selection(int[] arr){
        for(int i =0; i< arr.length; i++){
            //find the maximum item in teh ramaining array and swap with the correct index.
            int lastIndex = arr.length-i-1; //last index
            int maxIndex = getMaxIndex(arr, 0, lastIndex);

            swap(arr, maxIndex, lastIndex);
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]  = temp;
    }


    private static int getMaxIndex(int[] arr, int start, int end){
        int max = start;

        for(int i = start; i< end; i++){
            if(arr[i] > arr[max]){
                max = i; //returning the max index.
            }
        }
        return max;
    }
}
