import java.util.*;

public class TwoDimensionalArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int[][]arr = new int[3][3];
        System.out.println(arr.length);

        //taking the INPUT at perticular index of the array:
        for(int row = 0; row< arr.length; row++){
            //for each col in every row:
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
        }

        //OUTPUT:
        for(int row = 0; row< arr.length; row++){
            //for each col in every row:
            for(int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            //after printing a new row we need to add a new line:
            System.out.println();
        }


        //METHOD 2 : Another way of printing the outpuT
        for(int row = 0; row < arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }

        //METHOD 3 : Another way of printing the output:
        // in 2d array if we use the advance printing method then in heap array has an array itself in it 
        for(int[] a: arr){
            System.out.println(Arrays.toString(a))
        }
    }
}
