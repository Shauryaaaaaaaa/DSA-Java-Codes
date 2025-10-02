import java.util.*;

public class FindMinimumLinearSearch {
    public static void main(String[] args){
        int arr[] = {18,12,10, -4,7,4};
        System.out.println(min(arr));
    }


    static int min(int[]  arr){
        int min = arr[0];
        for(int i = 0; i< arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
