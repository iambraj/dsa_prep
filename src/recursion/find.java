package recursion;

import java.util.ArrayList;

public class find {
    public static void main(String[] args) {
    int [] arr = {2,4,66,7,44,6,6,6,9};
        System.out.println(findIn(arr,66,0));
        System.out.println(findOn(arr,8,0));
       findAll(arr,6,0);
         System.out.println(list);
        ArrayList<Integer> ans= findAllOk(arr,6, 0,new ArrayList<>());
        System.out.println(ans);
    }
    static boolean findIn(int [] arr , int target , int i ){
        if (i == arr.length){
            return false;
        }
        return arr[i] == target || findIn(arr ,target,i+1);
    }
    static int findOn(int[] arr, int target, int i){
        if (i == arr.length){
            return -1 ;
        }
        if (arr[i] == target ){
            return i ;
        }else{
            return findOn(arr,target ,i+1);
        }

    }
    static ArrayList<Integer> list = new ArrayList<>();

    static void findAll(int[] arr, int target, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == target) {
            list.add(i);
        }
        findAll(arr, target, i + 1);
    }
    static ArrayList<Integer> findAllOk(int [] arr, int target , int i, ArrayList<Integer>list){
        if (i == arr.length){
            return list ;
        }
        if(i== target){
            list.add(i);
        }
        return findAllOk(arr, target,i+1,list);
    }
}
