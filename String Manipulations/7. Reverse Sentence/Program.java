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

        sc.close();
    }

    void logic() {
        String words[] = sentence.split(" ");
        String str = "";

        for (int i = words.length - 1; i >= 0; i--) {
            str += words[i]+" ";
        }

        System.out.println("Reversed sentence: " + str.trim());
    }

    public static void main(String[] args) {
        Program object = new Program();
        object.inputString();
        object.logic();
    }

}
