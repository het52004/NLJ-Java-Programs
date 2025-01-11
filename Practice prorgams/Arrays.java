import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int choice;
        while (true) {
            System.out.print(
                    "1. Add Elements\n2. Print Array\n3. Largest Element\n4. Second largest element\n5. Sorting an array\n6. Exit\nEnter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addElements(arr, sc);
                    break;
                case 2:
                    printArray(arr);
                    break;
                case 3:
                    System.out.println("\nLargest Element: " + largestElement(arr) + "\n");
                    break;
                case 4:
                    System.out.println("\nSecond Largest Element: " + secondLargestElement(arr) + "\n");
                    break;
                case 5:
                    sortArray(arr);
                    break;
                case 6:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("a[" + i + "] = " + arr[i] + "\n");
        }
        System.out.println();
    }

    public static void addElements(int arr[], Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter a[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        System.out.println();
    }

    public static int largestElement(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int secondLargestElement(int arr[]) {
        int max = largestElement(arr);
        int secondMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > secondMax && arr[i] < max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static void sortArray(int arr[]) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[i] > arr[j + 1]) {
                    temp = arr[i];
                    arr[i] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("The array has been sorted!\n");
    }
}