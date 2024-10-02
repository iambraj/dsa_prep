package recursion;

import java.util.Arrays;

public class Mergsort {
    public static void main(String[] args) {
        int[] arr = {5,7,4,8,9,9,2,2,3,};
        mergsort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergsort(int[] arr, int s, int e) {
        if (e > s) { // Fixed the condition to check if the range is valid
            int m = (s + e) / 2; // Fixed the calculation of the middle index
            mergsort(arr, s, m);
            mergsort(arr, m + 1, e);
            merg(arr, s, m, e);
        }
    }

    private static void merg(int[] arr, int s, int m, int e) {
        int n1 = m - s + 1;
        int n2 = e - m; // Fixed the calculation of the length of the right subarray

        int[] left = new int[n1];
        int[] right = new int[n2];
        for (int i = 0; i < n1; i++) {
            left[i] = arr[s + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[m + 1 + j];
        }
        int i = 0, j = 0, k = s;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < n1) {
            arr[k++] = left[i++];
        }
        while (j < n2) {
            arr[k++] = right[j++];
        }
    }
}
