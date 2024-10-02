package recursion;

import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1,5,7,8,9};
        pat(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void pat(int[] arr, int r, int c, int m) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[m]) {
                pat(arr, r, c + 1, c);//here we are storing the value of m is 0 index means the first value like for this arr the value of m is 4;
            } else {
                pat(arr, r, c + 1, m);

            }
        }else{
                int temp = arr[m];
                arr[m] = arr[r - 1];
                arr[r - 1] = temp;
                pat(arr, r - 1, 0, 0);

            }
        }
    }

