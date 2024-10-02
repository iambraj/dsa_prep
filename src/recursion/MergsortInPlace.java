package recursion;

import java.util.Arrays;

public class MergsortInPlace {
    public static void main(String[] args) {
        int[] arr = {5, 7, 4, 8, 9, 3};
        mergsortInPlace(arr, 0, arr.length );
        System.out.println(Arrays.toString(arr));
    }

    public static void mergsortInPlace(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }
        int m = (s + e) / 2;
        mergsortInPlace(arr, s, m);
        mergsortInPlace(arr, m, e);
        mergInPlace(arr, s, m, e);
    }

    static void mergInPlace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];
        int i = s;
        int j = m;
        int k = 0;
        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k++] = arr[i++];
            } else {
                mix[k++] = arr[j++];
            }
        }
        while (i < m) {
            mix[k++] = arr[i++];
        }
        while (j < e) {
            mix[k++] = arr[j++];
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }
}
