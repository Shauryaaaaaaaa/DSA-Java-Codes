import java.util.*;

public class isPalindrome {
    public static void main(String[] args){
        String str = "AbcdCba";
        System.out.println(Palindromee(str));
    }

    static boolean Palindromee(String str){
        //EDGE CASE : INDEX OUT OF BOUND:
        if(str.length() == 0 || str == null){
            return true;
        }

        str = str.toLowerCase();
        for(int i = 0; i<str.length() / 2; i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length() -1 -i);  //whenever the start is at the start + 2 then the end will be at end - 2.hence (start - 1 - i)

            if(start != end){
                return false;
            }
            }
        return true;
    }
}
