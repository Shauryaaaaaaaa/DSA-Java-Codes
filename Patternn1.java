import java.util.*;

public class Patternn1 {

    public static void main(String[] args){
        Pattern1(4);
    }

    static void Pattern1(int n){
        //run the outer loop of rows for the n lines/rows.
        for(int row = 0; row<=n; row++){
            //for every row, run the col
            for(int col = 0; col <= row; col++){
                System.out.print("* ");
            }
            //whenever one row is printed, we need to add a newline:
            System.out.println();
        }
    }
}

