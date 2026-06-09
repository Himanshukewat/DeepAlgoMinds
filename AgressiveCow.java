import java.util.*;

class AgressiveCow {

    public static boolean helper(int[] stalls, int k, int guess) {
        int cow = 1;
        int prev = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            int dist = stalls[i] - prev;

            if (dist >= guess) {
                cow++;
                prev = stalls[i];

                if (cow >= k) {
                    return true;
                }
            }
        }

        return false;
    }

    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);

        int low = 1;
        int high = stalls[stalls.length - 1] - stalls[0];
        int res = -1;

        while (low <= high) {
            int guess = low + (high - low) / 2;

            if (helper(stalls, k, guess)) {
                res = guess;
                low = guess + 1;
            } else {
                high = guess - 1;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] stalls = new int[n];

            for (int i = 0; i < n; i++) {
                stalls[i] = sc.nextInt();
            }

            System.out.println(aggressiveCows(stalls, k));
        }

        sc.close();
    }
}