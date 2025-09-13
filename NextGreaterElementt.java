import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class NextGreaterElementt {
  public static void main(String[] args) throws NumberFormatException, IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    for(int i = 0; i < arr.length; i++){
      arr[i] = Integer.parseInt(br.readLine());
    }
    //CODE MAIN LOGIC:
    int[] rb = new int[arr.length]; //RightBoundary -> here we will iterate from arr.length-1 position.
    Stack<Integer> st = new Stack<>();
    st.push(arr.length - 1);
    rb[arr.length - 1] = arr.length; // if we not get the max value towards the right.

    for(int i = arr.length - 2; i>= 0; i--){
        while(st.size() > 0 && arr[i] < arr[st.peek()]){
            st.pop();
        }

        if(st.size() == 0){
            rb[i] =  arr.length;
        }else{
            rb[i] = st.peek();
        }
        st.push(i);
    }


    int[] lb = new int[arr.length]; //LeftBoundary
    st = new Stack<>();
    st.push(0);
    lb[0] = -1; // if we not get the max value towards the left.

 for(int i = 1; i< arr.length; i++){
        while(st.size() > 0 && arr[i] < arr[st.peek()]){
            st.pop();
        }

        if(st.size() == 0){
            lb[i] = -1;
        }else{
            lb[i] = st.peek();
        }
        st.push(i);
    }

    // Getting the maximum value for the array
    int maxArea = 0;
    for(int i = 0; i<arr.length; i++){
        int width = rb[i] - lb[i] - 1;
        int area = arr[i] * width;

        if(area > maxArea){
            maxArea = area;
        }
    }
    System.out.println(maxArea);
  }  
}
