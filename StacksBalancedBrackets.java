import java.util.*;

public class StacksBalancedBrackets {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else if (ch == ')') {
                boolean val = handleClosing(st, '(');
                if (!val) {
                    System.out.println(false);
                    return;
                }
            } else if (ch == ']') {
                boolean val = handleClosing(st, '[');
                if (!val) {
                    System.out.println(false);
                    return;
                }
            } else if (ch == '}') {
                boolean val = handleClosing(st, '{');
                if (!val) {
                    System.out.println(false);
                    return;
                }
            }
        }

        // After processing, stack must be empty
        System.out.println(st.isEmpty());
    }

    // Helper function to handle closing brackets
    public static boolean handleClosing(Stack<Character> st, char openingCharacter) {
        if (st.isEmpty()) {
            return false;
        } else if (st.peek() != openingCharacter) {
            return false;
        } else {
            st.pop();
            return true;
        }
    }
}
