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
                    // Get the previous character
                    char chr = (char) ((int) (ch[i]) - 1);
                    // if the previous character is any vowel then convert the chracter into its
                    // next character
                    if (chr == 'A' || chr == 'E' || chr == 'I' || chr == 'O' || chr == 'U') {
                        ch[i] = (char) ((int) (ch[i]) + 1);
                        // if the previous character is not a vowel then convert the character into its
                        // previous character
                    } else if (chr != 'A' || chr != 'E' || chr != 'I' || chr != 'O' || chr != 'U') {
                        ch[i] = chr;
                    }
                }
            }

        }

        System.out.println(">>> Manipulated string: "+String.valueOf(ch));
    }

    public static void main(String[] args) {
        Program object = new Program();
        object.inputString();
        object.logic();
    }

}
