package recursion;

public class sum {
        public static void main(String[] args) {
           int ans = sumOf(5);
            System.out.println(ans);
    }
    static int sumOf(int n ){
            if ( n <= 1 ){
                return 1 ;
            }
            return n + sumOf(n-1);
    }
}
