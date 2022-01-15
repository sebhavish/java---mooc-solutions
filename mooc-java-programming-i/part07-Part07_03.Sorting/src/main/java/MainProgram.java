
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4, 2, 6, 6, 8, 9, 4, 45};

        MainProgram.sort(numbers);
    }

    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            int smallestIndex = MainProgram.indexOfSmallestFrom(array, i);
            MainProgram.swap(array, i, smallestIndex);
            System.out.println(Arrays.toString(array));
        }
    }
    
    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int number: array) {
            if (number < smallest) {
                smallest = number;
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int index = startIndex;
        for (int i = index; i < table.length; i++) {
            if (table[i] < table[index]) {
                index = i;
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
