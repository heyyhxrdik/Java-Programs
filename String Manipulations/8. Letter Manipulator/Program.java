import java.util.*;

public class Program {

    String sentence;

    Program() {
        sentence = "";
    }

    void inputString() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a sentence: ");
        sentence = sc.nextLine();
        sentence = sentence.toUpperCase();

        sc.close();
    }

    void logic() {
        char[] ch = sentence.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            // Start the if when the character is not a whitespace
            if (ch[i] != ' ') {

                // If the character is any vowel, then add the vowel in the array and continue
                if (ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
                    ch[i] = ch[i];
                } else {
                    // if the previous character is any vowel then convert the chracter into its
                    // next character
                    if ((char) ((int) (ch[i]) - 1) == 'A' || (char) ((int) (ch[i]) - 1) == 'E'
                            || (char) ((int) (ch[i]) - 1) == 'I' || (char) ((int) (ch[i]) - 1) == 'O'
                            || (char) ((int) (ch[i]) - 1) == 'U') {
                        ch[i] = (char) ((int) (ch[i]) + 1);
                        // if the previous character is not a vowel then convert the character into its
                        // previous character
                    } else if ((char) ((int) (ch[i]) - 1) != 'A' || (char) ((int) (ch[i]) - 1) != 'E'
                            || (char) ((int) (ch[i]) - 1) != 'I' || (char) ((int) (ch[i]) - 1) != 'O'
                            || (char) ((int) (ch[i]) - 1) != 'U') {
                        ch[i] = (char) ((int) (ch[i]) - 1);
                    }
                }
            }

        }

        System.out.println("\n>>> Manipulated string: " + String.valueOf(ch));
    }

    public static void main(String[] args) {
        Program object = new Program();
        object.inputString();
        object.logic();
    }

}
