import java.util.*;

public class CyclicSort {
    public static void main(String[] args){
        int[] arr = {5,3,4,1,2};
        CycleSort(arr);
        System.out.print(Arrays.toString(arr));
    }

    static void CycleSort(int[] arr){
        //just we have to repeat: check , put at the correct postion , move:
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr, i , correctIndex);
            }else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
