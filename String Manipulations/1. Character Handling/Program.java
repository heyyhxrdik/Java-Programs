
import java.util.*;

public class Program {

    char ch;

    void inputCharacter() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        ch = sc.next().charAt(0);

        sc.close();
    }

    void logic() {
        if (Character.isLetter(ch)) {
            if (Character.isUpperCase(ch))
                System.out.println("After changing the case: " + Character.toLowerCase(ch));
            else
                System.out.println("After changing the case: " + Character.toUpperCase(ch));
        } else if (Character.isDigit(ch))
            System.out.println(ch + " is a digit.");
        else
            System.out.println(ch + " is a special character.");
    }

    public static void main(String[] args) {
        Program object = new Program();
        object.inputCharacter();
        object.logic();
    }

}