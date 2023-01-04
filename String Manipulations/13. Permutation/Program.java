import java.util.*;

public class Program {

    static String word;

    Program() {
        word = "";
    }

    void inputString() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        word = sc.next();

        sc.close();
    }

    void logic(String str, String ans) {

        if(str.length() == 0){
            System.out.println(ans+ " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            String ros = str.substring(0, i) + str.substring(i+1);

            logic(ros, ans+str.charAt(i));
        }

    }

    public static void main(String[] args) {
        Program object = new Program();
        object.inputString();
        object.logic(word, "");
    }

}
