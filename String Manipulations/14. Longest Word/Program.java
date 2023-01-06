import java.util.*;

public class Program {

    static String sentence;

    Program() {
        sentence = "";
    }

    void inputString() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        sentence = sc.nextLine();

        sc.close();
    }

    void logic() {

        String sent[] = sentence.split(" ");
        String max = sent[0];

        for (int i = 0; i < sent.length; i++) {
            if (sent[i].length() > max.length())
                max = sent[i];
        }

        System.out.println("Longest word in a sentence: " + max + "\nLength: " + max.length());

    }

    public static void main(String[] args) {
        Program object = new Program();
        object.inputString();
        object.logic();
    }

}
