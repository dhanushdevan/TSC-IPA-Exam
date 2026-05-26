import java.util.*;

public class FrequencryOrderSort {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 4, 1, 3, 4, 5, 6, 3, 2, 1, 2 };
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int count = map.getOrDefault(arr[i], 0);
            map.put(arr[i], count + 1);
        }
        List<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            newArr.add(arr[i]);
        }
        newArr.sort((a, b) -> {
            if (map.get(a) == map.get(b)) {
                return a - b;
            }
            return map.get(b) - map.get(a);
        });
        System.out.println("Array" + newArr);
    }
}