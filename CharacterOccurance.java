import java.util.*;

public class CharacterOccurance {

    public static void main(String[] args) {

        int arr[] = { 3, 4, 5, 6, 3, 4, 5, 3, 4, 4, 5, 4, 3, 34, 5 };

        Map<Integer, Integer> ocuurance = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int count = ocuurance.getOrDefault(arr[i], 0);
            ocuurance.put(arr[i], count + 1);
        }
        System.out.print("Ocuurance" + ocuurance);
    }

}
