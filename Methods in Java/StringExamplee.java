import java.util.*;

public class StringExamplee {
    public static void main(String[]args){
        /*String message = greeting();
        System.out.print("message is : " + message);*/

        /*Scanner in= new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = in.next();*/
        String personalised = myGreet("Shaurya");
        System.out.print(personalised);
    }

    static String myGreet(String name){
        String message = "Hello " + name + ", have a great day ahead!";
        return message;
    }

static String greeting(){
    String greet = "How are you";
    return greet;
}
}
