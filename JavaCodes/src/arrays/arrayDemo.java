package arrays;

import java.util.Arrays;

/*inserting an element in array
 * deleting element from an array
 * deleting element at certain index of an array
 * selection sort
 * bubble sort
 * insertion sort
 * merge two array
 */

public class arrayDemo {
    public static void main(String[] args) {
        int arr[] = { 22, 11, 44, 77, 33, 55, 66 };
        System.out.println(Arrays.toString(arr));
        // insertelement(arr, 100, 3);
        // deleteElement(arr, 77);
        // deleteIndex(arr, 2);
        // selectionSort(arr);
        // bubbleSort(arr);
        // insertionSort(arr);
        // System.out.println(Arrays.toString(arr));
    }

    /* Inserting an element in an array */

    static int[] insertelement(int arr[], int element, int position) {
        if (position < 0 || position >= arr.length) {
            System.out.println("Invalid positon");
            return arr;
        }
        int[] newArr = new int[arr.length + 1];

        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == position) {
                newArr[i] = element;
            } else {
                newArr[i] = arr[j];
                j++;
            }
        }

        System.out.println("Element " + element + " Instered at position " + position);
        System.out.println(Arrays.toString(newArr));
        return newArr;
    }

    /* Deleting an element from an array */
    static int[] deleteElement(int arr[], int element) {
        if (!containElement(arr, element)) {
            System.out.println("Element not found");
            return arr;
        }
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] != element) {
                newArr[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(newArr));
        return newArr;
    }

    private static boolean containElement(int[] arr, int element) {
        for (int value : arr) {
            if (value == element) {
                return true;
            }
        }
        return false;
    }

    /* Deleting an element on certain index from an array */
    static int[] deleteIndex(int arr[], int index) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index");
            return arr;
        }
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[j++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(newArr));
        return newArr;
    }

    /* Selection sort of array */
    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }
    }

    /* Bubble sort of array */
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /* insertion sort of array */
    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int j = 1; j < n; j++) {
            int key = arr[j];
            int i = j - 1;
            while ((i > -1 && (arr[i] > key))) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = key;
        }
    }

}