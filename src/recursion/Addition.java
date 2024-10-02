package recursion;

public class Addition {
    public static void main(String[] args) {
        int ans = sum(1234);
        System.out.println(ans );
    }
    static int sum(int num){
        if (num <= 10) {
            return num ;
        }
        return num %10 + sum(num/10);
    }

}
