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
        sentence = sentence.toLowerCase();

        sc.close();
    }

    void logic() {
        char[] ch = sentence.toCharArray();
        int counter = 0;

        for (int i = 0; i < ch.length - 3; i++) {
            if (ch[i] == ' ' && ch[i + 1] == 't' && ch[i + 2] == 'h' && ch[i + 3] == 'e')
                ++counter;
        }

        System.out.println("Frequency of word 'the': " + counter);

    }

    public static void main(String[] args) {
        Program object = new Program();
        object.inputString();
        object.logic();
    }

}
