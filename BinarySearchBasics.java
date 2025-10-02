import java.util.*;

public class BinarySearchBasics {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,22,33,55,66,77,88,99};
        int target = 55;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }


        //here we will return the index for the answer instead of the number.
    static int binarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){

            //toavoid the possibility of getting the range out we can use another mid formula:
            //int mid = (start + end) / 2;

            int mid = start + (end - start) / 2;

            if(target < arr[mid]){ // this means that the target lies on the left hand side.
                end = mid - 1;
            }

            else if(target > arr[mid]){ //this means that the target lies on the right hand side.
                start = mid + 1;
            }

            else{
                return mid;
            }
        }

        return -1;   // in case of the whole iteration we are not able to find the answer.

    }
}
