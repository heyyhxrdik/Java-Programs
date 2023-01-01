import java.util.*;

public class Program {
    String arr[];
    static Scanner sc = new Scanner(System.in);

    Program() {
        arr = new String[10];
    }

    static void print(String s) {
        System.out.print(s);
    }

    void inputArr() {
        for (int i = 0; i < arr.length; i++) {
            if (i == 0)
                print("Enter the " + (i + 1) + "st element: ");
            else if (i == 1)
                print("Enter the " + (i + 1) + "nd element: ");
            else if (i == 2)
                print("Enter the " + (i + 1) + "rd element: ");
            else
                print("Enter the " + (i + 1) + "th element: ");

            arr[i] = sc.nextLine();

            arr[i] = camelCase(arr[i]);

        }
        print("\n\n");
    }

    String camelCase(String str) {
        char ch[] = str.toCharArray();

        for (int j = 0; j < ch.length; j++) {
            if (j == 0) {
                ch[j] = Character.toUpperCase(ch[j]);
            }
        }

        str = String.valueOf(ch, 0, ch.length);

        return str;
    }

    void displayArr() {
        print(Arrays.toString(arr));
    }

    void logic() {
        print("Enter the first character of the name to be searched: ");
        char ch = sc.next().charAt(0);
        sc.close();
        print("\n\n");
        
        int counter = 1;
        boolean noNameFound = true;

        print("Names found with '"+Character.toUpperCase(ch)+"'\n\n");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(0) == Character.toUpperCase(ch)) {
                noNameFound = false;
                print((counter++) + ". " + arr[i]+"\n");
            }
        }

        if(noNameFound){
            print("\n\n>>> 0 names found!");
        }

    }

    public static void main(String[] args) {
        Program obj = new Program();
        obj.inputArr();
        obj.logic();
    }

}
