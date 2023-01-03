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
        int counter = 1;

        for(int i = 0; i<ch.length; i++){
            if(ch[i] == ',' || ch[i] == '.' || ch[i] == ';' || ch[i] == ':' || ch[i] == ' ' || ch[i] == '!')
            counter++;
        }

        System.out.println("Total number of special characters: "+counter);
    }

    public static void main(String[] args) {
        Program object = new Program();
        object.inputString();
        object.logic();
    }

}
