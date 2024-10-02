package recursion;

public class self_Learn {
    public static void main(String[] args) {
        System.out.println(peob(5));
    }
    static int  peob(int n ){
        if(n == 0 ){
            return -1 ;
        }
        return peob(n-1) + peob(n-2);
    }
}
