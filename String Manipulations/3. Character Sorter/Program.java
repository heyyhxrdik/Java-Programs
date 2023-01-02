import java.util.*;

public class Program {

    String word;

    Program() {
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
        int[] numCh = new int[ch.length];

        for (int i = 0; i < ch.length; i++) {
            numCh[i] = (int) ch[i];
        }

        for (int i = 0; i < numCh.length - 1; i++) {
            for (int j = 0; j < numCh.length - i - 1; j++)
                if (numCh[j] > numCh[j + 1]) {
                    numCh[j] = numCh[j] + numCh[j + 1];
                    numCh[j + 1] = numCh[j] - numCh[j + 1];
                    numCh[j] = numCh[j] - numCh[j + 1];
                }
        }

        for (int i = 0; i < numCh.length; i++) {
            ch[i] = (char) numCh[i];
        }

        System.out.println("Sorted characters: "+String.valueOf(ch));

    }

    public static void main(String[] args) {
        Program object = new Program();
        object.inputString();
        object.logic();
    }

}
