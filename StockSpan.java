import java.util.Stack;

public class StockSpan {
  public static int[] solve(int[] arr){
    Stack<Integer>st = new Stack<>();
    int[] span = new int[arr.length];
    st.push(0);
    span[0] = 1;
    for(int i = 1; i<arr.length;i++){
        //step 1 : poping out the values
        while(st.size() > 0 && arr[i] > arr[st.peek()]){
            st.pop();
        }

        //step 2.we have to find an answer
        if(st.size() == 0){
            span[i] = i + 1;
        }else{
            span[i] = i - st.peek();
        }
        //last mein we have to push objects.
        st.push(i);
    }
    return span;

  }  
}
