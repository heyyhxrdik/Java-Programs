import java.util.*;

public class Program {
    String arr[];
    static Scanner sc = new Scanner(System.in);

    Program() {
        arr = new String[7];
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
        int counter=0;
        for(String elem:arr){
            print((++counter) + ". " + elem+"\n");
        }
    }

    void logic() {
        String temp;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = (i + 1); j < arr.length; j++)
                if (arr[i].compareTo(arr[j]) > 0) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
        }
    }

    public static void main(String[] args) {
        Program obj = new Program();
        obj.inputArr();
        print(":: UNSORTED ARRAY ::\n\n");
        obj.displayArr();
        obj.logic();
        print("\n\n:: SORTED ARRAY ::\n\n");
        obj.displayArr();
    }

}
