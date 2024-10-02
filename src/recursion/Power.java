package recursion;//another way to do this recursion.question given billow

public class Power {
    public static void main(String[] args) {
int ans = pow(5,5);
        System.out.println(ans );
    }
    public static int  pow  (int p , int q){
        if (q == 0) {
            return 1 ;
        }
        return p * pow(p,q-1);
    }

}

/*
static int pow(int p, int a)f
if(q =0)return 1;
int smallPow = pow(p, q:q/2);
        if(q%2=0){//even hai to
        return smallPow *smallPow;
｝//else
        return p *smallPow *smallPow;

 */