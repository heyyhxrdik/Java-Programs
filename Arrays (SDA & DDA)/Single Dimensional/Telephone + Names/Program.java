import java.util.*;

public class Program {
    String names[];
    long numbers[];
    static Scanner sc = new Scanner(System.in);

    Program() {
        names = new String[5];
        numbers = new long[5];
    }

    static void print(String s) {
        System.out.print(s);
    }

    void inputNameArr() {
        for (int i = 0; i < names.length; i++) {
            if (i == 0)
                print("Enter the " + (i + 1) + "st element: ");
            else if (i == 1)
                print("Enter the " + (i + 1) + "nd element: ");
            else if (i == 2)
                print("Enter the " + (i + 1) + "rd element: ");
            else
                print("Enter the " + (i + 1) + "th element: ");

            names[i] = sc.nextLine();
            names[i] = camelCase(names[i]);

        }
        print("\n\n");
    }

    void inputNumberArr() {
        for (int i = 0; i < names.length; i++) {
            if (i == 0)
                print("Enter the " + (i + 1) + "st element: ");
            else if (i == 1)
                print("Enter the " + (i + 1) + "nd element: ");
            else if (i == 2)
                print("Enter the " + (i + 1) + "rd element: ");
            else
                print("Enter the " + (i + 1) + "th element: ");

            numbers[i] = sc.nextLong();

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
        int counter = 0;
        print("\n\nSl.\t\tNAMES\t\t\tTELEPHONE\n\n");
        for (int i = 0; i < 5; i++) {
            print((++counter)+".\t\t" + names[i] + "\t\t" + numbers[i] + "\n");
        }
        print("\n\n");
    }

    void logic(){
        print("\nEnter a name: ");
        String name = sc.nextLine();
        boolean found = false;
        int teleIndex = 0;

        name = camelCase(name);

        for(int i = 0; i<names.length; i++){
            if(names[i].equals(name)){
                found = true;
                teleIndex = i;
            }
        }

        if(found){
            print("\nTelephone number of "+name+" is: "+numbers[teleIndex]);
        }
        else{
            print("\nNo such name found!!");
        }
    }

    public static void main(String[] args) {
        Program obj = new Program();
        print("ENTER NAMES BELOW\n");
        obj.inputNameArr();
        print("ENTER THE RESPECTIVE TELEPHONE NUMBERS BELOW\n");
        obj.inputNumberArr();
        print(":: TABLE ::\n\n");
        obj.displayArr();
        obj.logic();
    }

}
