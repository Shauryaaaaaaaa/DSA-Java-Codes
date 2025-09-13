import java.util.*;

public class StacksDuplicateBrackets {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch == ')'){
                if(st.peek() == '('){ // duplicate brackets case
                    System.out.println(true);
                    return;
                } else {
                    while(st.peek() != '('){
                        st.pop();
                    }
                    st.pop(); // remove '(' , this extra pop will remove the opening bracket.
                }
            } else {
                st.push(ch);
            }
        }

        System.out.println(false); // no duplicates found
    }
}
