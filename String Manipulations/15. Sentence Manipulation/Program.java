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

    boolean isVowel(char word) {
        word = Character.toUpperCase(word);
        switch (word) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
            default:
                return false;
        }
    }

    void logic() {

        StringTokenizer ob = new StringTokenizer(sentence, " ");
        String word;
        int count = 0;

        StringBuffer strVowel = new StringBuffer("");
        StringBuffer strConsonants = new StringBuffer("");

        while (ob.hasMoreTokens()) {
            word = ob.nextToken();

            if (isVowel(word.charAt(0)) && isVowel(word.charAt(word.length() - 1))) {
                count += 1;
                strVowel.append(word + " ");
            } else {
                strConsonants.append(word + " ");
            }
        }

        String str = strVowel.toString() + strConsonants.toString();

        System.out.println("Number of words beigining and ending wiht a vowel: " + count);
        System.out.println(str.trim());

    }

    public static void main(String[] args) {
        Program object = new Program();
        object.inputString();
        object.logic();
    }

}
