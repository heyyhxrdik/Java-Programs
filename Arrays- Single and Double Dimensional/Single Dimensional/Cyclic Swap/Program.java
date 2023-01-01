import java.util.*;

public class Program {
    int arr[];

    Program() {
        arr = new int[10];
    }

    static void print(String s) {
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

    void displayArr() {
        print(Arrays.toString(arr));
    }

    void logic() {

        arr[0] = arr[0] + arr[arr.length - 1];
        arr[arr.length - 1] = arr[0] - arr[arr.length - 1];
        arr[0] = arr[0] - arr[arr.length - 1];

        for (int i = 1; i < arr.length - 2; i++) {

            arr[i] = arr[i] + arr[i + 1];
            arr[i + 1] = arr[i] - arr[i + 1];
            arr[i] = arr[i] - arr[i + 1];

        }
    }

    public static void main(String[] args) {
        Program obj = new Program();
        obj.inputArr();
        print(":: UNSWAPPED ARRAY ::\n\n");
        obj.displayArr();
        obj.logic();
        print("\n\n:: SWAPPED ARRAY ::\n\n");
        obj.displayArr();
    }

}
