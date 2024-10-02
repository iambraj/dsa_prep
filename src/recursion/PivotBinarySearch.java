package recursion;

public class PivotBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(search(arr, 2, 0, arr.length - 1));
    }

    static int search(int[] arr, int t, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2; // Corrected pivot calculation
        if (arr[m] == t) {
            return m;
        }
        if (arr[s] <= arr[m]) {
            if (t >= arr[s] && t <= arr[m]) {
                return search(arr, t, s, m - 1);
            } else {
                return search(arr, t, m + 1, e);
            }
        } else {
            if (t >= arr[m] && t <= arr[e]) {
                return search(arr, t, m + 1, e);
            } else {
                return search(arr, t, s, m - 1);
            }
        }
    }
}
