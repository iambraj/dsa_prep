package recursion;

import java.util.ArrayList;

public class Stringsubset {
    public static void main(String[] args) {
       check("", "1,2,3");
         System.out.println(checkit("", "ABCDE"));
       checkascii("", "abc");
       System.out.println(checkitst("", "abc"));
    }

    static void check(String p, String op) {
        if (op.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = op.charAt(0);
        check(p + ch, op.substring(1));
        check(p, op.substring(1));
    }

    static ArrayList<String> checkit(String p, String op) {
        if (op.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = op.charAt(0);
        ArrayList<String> left = checkit(p + ch, op.substring(1));
        ArrayList<String> right = checkit(p, op.substring(1));
        left.addAll(right);
        return left;
    }

    static void checkascii(String p, String op) {
        if (op.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = op.charAt(0);
        checkascii(p + ch, op.substring(1));
        checkascii(p, op.substring(1));
        checkascii(p + (ch + 0), op.substring(1));
    }
    static ArrayList<String> checkitst(String p, String op) {
        if (op.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = op.charAt(0);
        ArrayList<String> first = checkitst(p + ch, op.substring(1));
        ArrayList<String> second  = checkitst(p, op.substring(1));
        ArrayList<String> third= checkitst(p+(ch+0), op.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
