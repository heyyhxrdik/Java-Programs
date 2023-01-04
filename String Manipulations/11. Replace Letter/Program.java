import java.util.*;

public class Program {

    String sentence;

    Program() {
        sentence = "";
    }

    void inputString() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        sentence = sc.nextLine();
        sentence = " " + sentence;

        sc.close();
    }

    void logic() {
        char[] ch = sentence.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ') {
                ch[i + 1] = 'X';
            }
        }

        System.out.println("Modulated string: " + String.valueOf(ch));

    }

    public static void main(String[] args) {
        Program object = new Program();
        object.inputString();
        object.logic();
    }

}
