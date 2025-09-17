import java.util.*;

public class ArrayOfObjects {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] str = new String[4];
        for(int i = 0; i< str.length; i++){
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

        //MODIFYING THE OBJECT FOR AN INDEX:
        str[1] = "Virat";
        System.out.println(Arrays.toString(str));
        
    }
}
