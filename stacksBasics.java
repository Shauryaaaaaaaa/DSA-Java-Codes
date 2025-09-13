import java.util.Stack;

public class stacksBasics {
      public static void main(String[] args){
          Stack<Integer> st = new Stack<>();
          st.push(10);
          st.push(30);
          st.push(40);
          System.out.println(st.peek());
          st.pop();
          st.push(59);
          st.push(67);
          System.out.println(st.peek());
      }
    }
