import java.util.*;

public class StringComparison {
    public static void main(String[] args){
    String a = "Kunal";
    String b = "Kunal";
    String c = a;
    System.out.println(a == c);
    System.out.println(a == b);

    String name1 = new String("Shaurya");
    String name2 = new String("Shaurya");

    System.out.println(name1 == name2);
    System.out.println(name1.equals(name2));

    name2 = "abchdbasgdbfa";

        System.out.println(name1.equals(name2));
    }
}
