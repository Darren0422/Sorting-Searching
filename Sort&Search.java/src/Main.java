/*
 * Which searching algorithm would be appropriate to use on the given list?
 * - Linear search
 * 
 * Explain why you think this algorithm was a good choice.
 * - The array of integers are not in order so a linear search is appropriate .
 * 
 * Implement the searching algorithm you haven’t tried yet in this Task on the sorted array to find the number 9. Add a comment to explain where you would use this algorithm in the real world.
 * - Binary search is used on sorted lists to speed up the search. This search method is used in in the real world through searching large databases or as part of a file system. 
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        // Array with elements is created and is printed
        // The linearSearch method is called to obtain the index of 9 and then is
        // printed
        int[] array = { 27, -3, 4, 5, 35, 2, 1, -40, 7, 18, 9, -1, 16, 100 };

        System.out.println("\nThe original array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("");
        System.out.println("\nThe index of number 9 is: " + linearSearch(9, array));

        // The insertionSort method is called on the array to sort it in ascending order
        // and it then printed.
        insertionSort(array);

        System.out.println("\nThe sorted array using the Insertion Sort method: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        // .binarySearch method is used to obtain the index of 9 and then is printed
        // (.binarySearch can be used from the arrays class as the array is already
        // sorted)
        int index = Arrays.binarySearch(array, 9);
        System.out.println("");
        System.out.println("\n'9' in the sorted array is at index: " + index);

    }

    /**
     * Searches for a specific item in an array using linear search.
     *
     * @param item The item to search for in the array.
     * @param list The array in which to perform the search.
     * @return The index of the first occurrence of the searched item in the array,
     *         or -1 if the item is not found.
     */
    public static int linearSearch(int item, int[] list) {
        // index is -1, if its not changed, the item isnt found
        int index = -1;
        // loop through each element in the array
        // If the lists index matches the search item, the index is updated and the loop
        // breaks and returns the index (of the searched item in the array).
        for (int i = 0; i < list.length; i++) {
            if (list[i] == item) {
                index = i;
                break;
            }
        }
        return index;
    }

    /**
     * Sorts an array of integers using the Insertion Sort algorithm.
     *
     * @param array The array of integers to be sorted.
     */
    public static void insertionSort(int[] array) {
        int n = array.length;

        // i starts at 1 as 0 is considered sorted. It will iterate over the unsorted
        // parts of the array
        // Key is the value of the currennt index and is the element that will be
        // compared
        // J is i - 1 , so that it will be compared to the elemet on the left which will
        // be the sorted element
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            // While loop as long as J is greater or equal to 0 (If J was negative, its out
            // of the sorted part of the array ) and if index of J is greater than the key
            // If true, index j is shifted to the right to make space for the key to be
            // inserted. The j is shifted to the left so it can continue comparing to the
            // other sorted elements
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            // This places the key in the correct postion
            array[j + 1] = key;
        }
    }

}
