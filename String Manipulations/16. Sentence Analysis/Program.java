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
        sentence = " " + sentence;

        sc.close();
    }

    int vowelCount(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            switch (Character.toUpperCase(word.charAt(i))) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    count += 1;
                    break;
            }
        }
        return count;
    }

    void logic() {

        char words[] = sentence.toCharArray();

        for (int i = 0; i < words.length - 1; i++)
            if (words[i] == ' ')
                words[i + 1] = Character.toUpperCase(words[i + 1]);

        sentence = String.valueOf(words).trim();

        StringTokenizer obj = new StringTokenizer(sentence, " ");
        System.out.println(sentence);

        System.out.println("\nWord\t\t\t\t\tVowels\t\t\t\tConsonants");

        while (obj.hasMoreTokens()) {
            String word = obj.nextToken();
            System.out.println(word + "\t\t\t\t" + vowelCount(word) + "\t\t\t\t" + (word.length() - vowelCount(word)));
        }

    }

    public static void main(String[] args) {
        Program object = new Program();
        object.inputString();
        object.logic();
    }

}
