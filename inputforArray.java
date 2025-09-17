import java.util.*;
public class inputforArray {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
       /* arr[0] = 23;
        arr[1] = 45;
        arr[2] = 12;
        arr[3] = 9; 
        arr[4] = 78;
        System.out.println(arr[0]);*/

        //taking the input of larger size lets say for 1000 size:
        for(int i = 0; i< arr.length; i++){
            arr[i] = in.nextInt();
        }
//METHOD 1 : For printing the elements of an array.

        /*for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i] + " ");
        }*/

        //METHOD 2: For printing the elements of an array.
        for(int num : arr){
            System.out.println(num + " ");
        }

        //METHOD 3: For printing the elements of an array.(Easiest)
        System.out.println(Arrays.toString(arr)); //this will convert the array to a string and then will print it.
    }
}
