import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Arraylist is created and the elements are added.
        ArrayList<String> list = new ArrayList<>();

        list.add("blue");
        list.add("six");
        list.add("hello");
        list.add("game");
        list.add("unorthodox");
        list.add("referee");
        list.add("ask");
        list.add("zebra");
        list.add("run");
        list.add("flex");

        System.out.println("\nOriginal List: " + list);

        // The bubbleSort function is called to sort the list and then it is printed.
        bubbleSort(list);

        System.out.println("\nSorted List: " + list);
    }

    /**
     * Sorts an ArrayList of strings using the Bubble Sort algorithm.
     *
     * A for loop to deincrement from the end of the array and an inner loop for the
     * current index of i (j)
     * J-1 (left) and J (right). If left is bigger than right, temp is set to j-1 to
     * keep the value.
     * The values are then swapped around
     * Once the iterations are complete, the array will be sorted alpabetically in
     * ascending order.
     *
     * @param arrayList The ArrayList of strings to be sorted.
     */
    static void bubbleSort(ArrayList<String> arrayList) {
        for (int i = (arrayList.size() - 1); i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (arrayList.get(j - 1).compareTo(arrayList.get(j)) > 0) {
                    String temp = arrayList.get(j - 1);
                    arrayList.set(j - 1, arrayList.get(j));
                    arrayList.set(j, temp);
                }
            }
        }
    }

}
