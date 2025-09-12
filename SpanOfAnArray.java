import java.util.*;

public class SpanOfAnArray {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        if (n == 0) {
            System.out.println("Array is empty, span not defined.");
            scn.close();
            return;
        }

        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for(int i = 1; i < arr.length; i++){
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        // printing the value of span
        System.out.println(max - min);
        scn.close();
    }
}
