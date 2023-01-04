
import java.util.*;
public class Program {

    String word;

    Program(){
        word = "";
    }

    void inputString() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        word = sc.next();
        word = word.toLowerCase();

        sc.close();
    }

    void logic() {
        String str = new String();
        System.out.println("STRING: "+str);
        int len = word.length();

        for(int i = 0; i< len; i++){
            char c = word.charAt(i);

            if(str.indexOf(c) < 0){
                str += c;
            }
        }

        System.out.println("Output: "+str);
    }

    public static void main(String[] args) {
        Program object = new Program();
        object.inputString();
        object.logic();
    }

} 

