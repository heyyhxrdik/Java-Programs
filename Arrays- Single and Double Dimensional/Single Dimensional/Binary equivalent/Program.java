import java.util.*;

public class Program {
    int n;

    Program(){
        n = 0;
    }

    static void print(String s) {
        System.out.print(s);
    }

    void inputArr() {
        Scanner sc = new Scanner(System.in);
        print("Enter a number: ");

        n = sc.nextInt();

        sc.close();
    }

    void logic(){

        int binary[] = new int[35];
        int id = 0;

        while(n > 0){
            binary[id++] = n % 2;
            n = n/2;
        }

        print("Binary equivalent: ");
        for(int i = id-1; i>=0; i--){
            print(binary[i]+"");
        }

        }

    public static void main(String[] args) {
        
        Program obj = new Program();
        obj.inputArr();
        obj.logic();

    }

}