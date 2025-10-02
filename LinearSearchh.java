import java.util.*;
public class LinearSearchh{
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,66,77,88,99};
        int target = 66;
        linearSearch(arr, target);
        System.out.println("Target found at index: " + linearSearch(arr, target));
    }

    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int i = 0; i< arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}

