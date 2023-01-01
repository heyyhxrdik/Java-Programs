import java.util.*;

public class Program {
    int numbers[];

    Program(){
        numbers = new int[2];
    }

    static void print(String s) {
        System.out.print(s);
    }

    void inputArr() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            if (i == 0)
                print("Enter the " + (i + 1) + "st element: ");
            else if (i == 1)
                print("Enter the " + (i + 1) + "nd element: ");
            else if (i == 2)
                print("Enter the " + (i + 1) + "rd element: ");
            else
                print("Enter the " + (i + 1) + "th element: ");

            numbers[i] = sc.nextInt();

        }
        print("\n\n");
        sc.close();
    }

    void logic(){

        int count=0;
        
        while( numbers[0]>0 || numbers[1]>0 ){
            count += (numbers[0] & 1) ^ (numbers[1] & 1);
            numbers[0] >>= 1;
            numbers[1] >>= 1;
        }

        print("\n\nHamming distance: "+count);
    }

    public static void main(String[] args) {
        
        Program obj = new Program();
        obj.inputArr();
        obj.logic();

    }

}