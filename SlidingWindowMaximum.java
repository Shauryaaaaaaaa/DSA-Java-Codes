import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class SlidingWindowMaximum {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        // write your code here
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[arr.length];
        st.push(arr.length - 1);

        nge[arr.length - 1] = arr.length;

        for(int i = arr.length - 2; i >= 0; i--){
            //for nge the drill is : pop ans push
            while(st.size() > 0 && arr[i] >= arr[st.peek()]){ //as we have stored the index in the stack neither we have stored the value.
                st.pop();
            }
            if(st.size() == 0){
                nge[i] = arr.length; //generally we use to take -1 but in this question we will the n value.
            }else{
                nge[i] = st.peek();
            }

            st.push(i);
        }

        int j = 0;

        for(int i = 0; i<= arr.length - k; i++){
            if(j < i){
                j = i;
            }
            while(nge[j] < i + k){
                j = nge[j];
            }

            System.out.println(arr[j]);
        }
    }
}
