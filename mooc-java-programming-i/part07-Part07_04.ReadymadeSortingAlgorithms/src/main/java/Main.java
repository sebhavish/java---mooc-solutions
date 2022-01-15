
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        Main.sort(array);
        System.out.println(Arrays.toString(array));
        
        String[] stringArray = {"bhavish", "reddy", "good"};
        Main.sort(stringArray);
        System.out.println(Arrays.toString(stringArray));
        
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(90);
        integerList.add(45);
        integerList.add(60);
        Main.sortIntegers(integerList);
        System.out.println(integerList);
        
        ArrayList<String> stringsList = new ArrayList<>();
        stringsList.add("Lisbon");
        stringsList.add("Berlin");
        stringsList.add("Tokyo");
        stringsList.add("Nairobi");
        Main.sortStrings(stringsList);
        System.out.println(stringsList);
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }
    
    public static void sort(String[] array) {
        Arrays.sort(array);
    }
    
    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }
    
    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }
}
