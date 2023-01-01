import java.util.*;

public class Program {
    int arr[];
    static Scanner sc = new Scanner(System.in);

    Program() {
        arr = new int[10];
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

            arr[i] = sc.nextInt();

        }
        print("\n\n");
    }

    void displayArr() {
        print(Arrays.toString(arr));
    }

    void logic(int target) {

        int lower = 0, upper = (arr.length - 1), middle = 0;
        boolean isfound = false;

        while (lower <= upper) {
            middle = (lower + upper) / 2;

            if (arr[middle] < target) {
                lower = middle + 1;
            }

            if (arr[middle] > target) {
                upper = middle - 1;
            }

            if (arr[middle] == target) {
                isfound = true;
            }
        }

        if (isfound)
            print("\n>>> Search successfull!!\n");
        else
            print("\n>>> Search unsuccessfull!!\n");
    }

    public static void main(String[] args) {
        Program obj = new Program();
        obj.inputArr();
        print(":: ENTERED ARRAY ::\n\n");
        obj.displayArr();

        print("\n\nEnter the element to find in the array: ");
        int n = sc.nextInt();
        sc.close();

        obj.logic(n);
    }
}
