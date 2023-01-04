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
        char[] ch = sentence.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            switch (ch[i]) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    ch[i] = (char) (((int) ch[i]) + 2);
                    break;
                case 'z':
                case 'Z':
                    ch[i] = (char) (((int) ch[i]) - 25);
                    break;
                default:
                    ch[i] = (char) (((int) ch[i]) + 1);
                    break;
            }
        }

        System.out.println("Encoded string: " + String.valueOf(ch));

    }

    public static void main(String[] args) {
        Program object = new Program();
        object.inputString();
        object.logic();
    }

}
