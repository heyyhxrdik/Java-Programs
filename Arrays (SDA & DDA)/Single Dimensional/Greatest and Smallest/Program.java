
/**
 * Program
 */
import java.util.*;

public class Program {

    int arr[];

    Program() {
        arr = new int[10];
    }

    void print(String s) {
        System.out.print(s);
    }

    void inputArr() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            if (i == 0)
                print("Enter the " + (i + 1) + "st element: ");
            else if (i == 1)
                print("Enter the " + (i + 1) + "nd element: ");
            else if (i == 2)
                print("Enter the " + (i + 1) + "rd element: ");
            else
                print("Enter the " + (i + 1) + "th element: ");

            arr[i] = sc.nextInt();

        }
        print("\n\n");
        sc.close();
    }

    void displayArr(){
        print(":: ENTERED ARRAY ::\n\n");
        print(Arrays.toString(arr));
    }

    void logic(){
        int min = arr[0], max = arr[0];

        for(int i = 0; i<arr.length; i++){
            if(arr[i] < min)
            min = arr[i];
            
            if(arr[i] > max)
            max = arr[i];
        }

        print("\n\nMaximum element in the array: "+max);
        print("\nMinimum element in the array: "+min);
    }

    public static void main(String[] args) {
        Program obj = new Program();
        obj.inputArr();
        obj.displayArr();
        obj.logic();
    }

}