package recursion;

public class question {
    public static void main(String[] args) {
        ret("", "ab");
    }

    public static void ret(String p, String op) {
        if (op.isEmpty()) {
            System.out.println(p);
            return;
        }

        char currentChar = op.charAt(0);
        int start = (currentChar - 'a') * 3 + 1;
        int end = start + 2;

        for (int i = start; i <= end; i++) {
            char ch = (char) ('a' + i - 1);
            ret(p + ch, op.substring(1));
        }
    }
}
