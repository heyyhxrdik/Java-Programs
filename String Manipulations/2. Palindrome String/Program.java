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

        sc.close();
    }

    void logic() {
        char[] ch = word.toCharArray();
        char[] revWord = new char[ch.length];
        int counter=0;

        for(int i = ch.length-1; i>=0; i--){
            revWord[counter++] = ch[i];
        }

        String str = String.valueOf(revWord, 0, revWord.length);
        System.out.println("Reverse string: "+str);
        if(word.equals(str))
            System.out.println(">>> Palidrome string");
        else
            System.out.println(">>> Not a palindrome string");

    }

    public static void main(String[] args) {
        Program object = new Program();
        object.inputString();
        object.logic();
    }

} 

