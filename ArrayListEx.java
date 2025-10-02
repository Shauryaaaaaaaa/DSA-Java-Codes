import java.util.*;

public class ArrayListEx {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i<5; i++){
            list.add(in.nextInt());

            //to get an item at perticular index:
            System.out.println(list.get(i));
        }

        //checks if there is the value available for the asked value
        System.out.println(list);
        list.contains(55);
    }
}
