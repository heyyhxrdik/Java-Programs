
import java.util.*;
public class Program {

    String word;

    Program(){
        word = "";
    }

    void inputString() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        word = sc.next();
        word = word.toLowerCase();

        sc.close();
    }

    void logic() {
        char[] ch = word.toCharArray();
        char[] finalArr = new char[ch.length+2];
        char[] endCharacters = {'a', 'y'};
        int counter =0, vowelLoc=0;

        for(int i = 0; i<ch.length; i++){
            if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u'){
                vowelLoc = i;
                break;
            }
        }
        
        for(int i = vowelLoc; i<ch.length; i++){
            finalArr[counter++] = ch[i];
        }

        for(int i = 0; i<vowelLoc; i++){
            finalArr[counter++] = ch[i];
        }

        for(int i=0; i<endCharacters.length; i++){
            finalArr[counter++] = endCharacters[i];
        }

        System.out.println("Piglatin equivalent: "+String.valueOf(finalArr));
    }

    public static void main(String[] args) {
        Program object = new Program();
        object.inputString();
        object.logic();
    }

} 

