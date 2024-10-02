package recursion;

public class number_Permutations {

        public static void main(String[] args) {
            permutations("", "4321");
        }

        static void permutations(String p, String up) {
            if (up.isEmpty()) {
                System.out.println(p); // If the remaining string is empty, print the permutation
                return;
            }

            for (int i = 0; i <= p.length(); i++) {
                char ch = up.charAt(0); // Take the first character of the remaining string up
                String f = p.substring(0, i); // Prefix of p from 0 to i (exclusive)
                String s = p.substring(i); // Suffix of p from i to the end

                permutations(f + ch + s, up.substring(1)); // Recursively call permutations with the new permutation and the remaining string
            }
        }
    }


