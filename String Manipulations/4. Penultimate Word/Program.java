import java.util.*;
public class Program {

    String sentence;

    Program(){
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
        String str="";
        
        int lastIndex = sentence.lastIndexOf(" "),firstIndex=0;

        for(int i = lastIndex-1; i>=0; i--){
            if(ch[i] == ' '){
                firstIndex = i+1;
                break;
            }
        }
        
        for(int i = firstIndex; i<=lastIndex; i++){
            str += ch[i];
        }

        System.out.println("Penultimate word: "+str);

        
    }

    public static void main(String[] args) {
        Program object = new Program();
        object.inputString();
        object.logic();
    }

} 

