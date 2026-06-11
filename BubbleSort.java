import java.util.List;

public class BubbleSort {
        public static void countSwaps(List<Integer> a) {
    // Write your code here
        int swaps = 0;
        for (int i = a.size(); i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (a.get(j) > a.get(j + 1)) {
                    int temp = a.get(j);
                    a.set(j, a.get(j + 1));
                    a.set(j + 1, temp);
                    swaps++;
                }
            }
            
    }
            System.out.println("Array is sorted in " + swaps + " swaps.");
            System.out.println("First Element: " + a.get(0));
            System.out.println("Last Element: " + a.get(a.size() - 1));
    }

}

