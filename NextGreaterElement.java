import java.util.Stack;

public class NextGreaterElement {
    public static int[] solve(int[] arr){
        int nge[] = new int[arr.length]; //we will return a nge array same length as the default input array

        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length - 1]);

        nge[arr.length - 1] = -1;
        for(int i = arr.length - 2; i>=0; i--){
             //pop kab tak hoga
             while(st.size() > 0 && arr[i] >= st.peek()){
                st.pop();
             } 

             //then after the first step it will put up an answer as the second step
             if(st.size() == 0){
                nge[i] = -1;
             }else{
                nge[i] = st.peek();
             }

             //finally the third step push itself in the stack 
             st.push(arr[i]);
        }
        return nge;
    }
}
