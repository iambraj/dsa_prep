package recursion;

public class Subset_subsequence {
    public static void main(String[] args) {
        int[] a = {2, 4, 5};
        sumsubset(a, a.length, 0, 0);
    }

    static void sumsubset(int[] a, int n, int idx, int sum) {
        if (idx >= n) {
            System.out.println(sum);
            return;
        }
        sumsubset(a, n, idx + 1, sum);
        sumsubset(a, n, idx + 1, sum + a[idx]);
    }
}
