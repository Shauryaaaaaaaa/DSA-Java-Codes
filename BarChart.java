import java.util.*;

public class BarChart {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }

        // storing the maximum value of array
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        // print bar chart
        for(int floor = max; floor >= 1; floor--){ // floor levels
            for(int i = 0; i < arr.length; i++){   // buildings (columns)
                if(arr[i] >= floor){
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();  // ✅ move to next line after each floor
        }
    }
}

