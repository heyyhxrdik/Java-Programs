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

        // Since the array is unsorted, at first it requires sorting. Thus the variable
        // requiresSwapping is initialised with true
        boolean requiresSwapping = true;

        while (requiresSwapping) {

            // Then the flag is set to false, just to break the loop if none of the elements
            // in the array require sorting.
            requiresSwapping = false;

            for (int i = 0; i > arr.length - 1; i++) {

                // Sorting in descending order.
                if (arr[i] < arr[i + 1]) {
                    // And if the elements are unsorted, then the flag is set to true and continues
                    // till no swapping is required.
                    requiresSwapping = true;
                    arr[i] = arr[i] + arr[i + 1];
                    arr[i + 1] = arr[i] - arr[i + 1];
                    arr[i] = arr[i] - arr[i + 1];
                }
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
