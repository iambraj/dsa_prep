package recursion;

public class Sorted {
    public static void main(String[] args) {
        int [] arr = {4,5,6,77,8,9};
        System.out.println( sort( arr ,0));
    }
    static boolean sort(int [] arr , int i ){
        //base condition
        if (i == arr.length -1 ){
            return true ;
        }
        return arr[i] < arr[i+1] && sort(arr ,i+1);
    }

}
