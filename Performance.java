import java.util.*;

public class Performance {
    public static void main(String[] args){
        String series = "";
        for(int i = 0; i< 26; i++){
            char ch = (char)('a' + i); //a = 0 : a, a+ 1 : b,.....
            series = series + ch;
        }
        System.out.println(series); //as the series is the string hence it will be " " + a = a then it will remain a as it is a string and  concatenation with the string gives the character itself.
    }
}
