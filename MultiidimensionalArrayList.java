import java.util.*;

public class MultiidimensionalArrayList {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //initialization:
        for(int i = 0; i< 3; i++){
            list.add(new ArrayList<>());
        }

        //add Element:
        for(int i = 0; i<3; i++){
            for(int j = 0; j< 3 ; j++){
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);

    }
}
