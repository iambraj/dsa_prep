package recursion;

import java.util.ArrayList;

public class maze {
    public static void main(String[] args) {
       // System.out.println(count(3,3));
        //path("", 3, 3);
        //System.out.println(pathRet(" ",3,3));
        //System.out.println(pathRetDiagonal("",3,3));
        boolean [][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        pathRestrictions("",board,0,0);
    }

    public static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int right = count(r - 1, c);
        int left = count(r, c - 1);
        return right + left;
    }








    static void path(String p, int r, int l) {
        if (r == 1 && l == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1) {
            path(p + 'D', r - 1, l);
        }
        if (l > 1) {
            path(p + 'R', r, l - 1);
        }
    }






    static ArrayList<String> pathRet(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1) {
            list.addAll(pathRet(p + 'D', r - 1, c));
        }
        if (c > 1) {
            list.addAll(pathRet(p + 'R', r, c - 1));
        }
        return list;
    }




    static ArrayList<String> pathRetDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1 && c >1) {
            list.addAll(pathRetDiagonal(p + 'D', r - 1, c-1));
        }
        if (r > 1) {
            list.addAll(pathRetDiagonal(p + 'v', r - 1, c));
        }
        if (c > 1) {
            list.addAll(pathRetDiagonal(p + 'h', r, c - 1));
        }
        return list;
    }






static void pathRestrictions(String p , boolean [][] maze,int r, int c){
        if(r == maze.length-1 && c ==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c] ){
            return;
    }

    if (r < maze.length-1) {
        pathRestrictions(p + 'D',maze, r + 1, c);
    }
    if (c < maze[0].length-1) {
        pathRestrictions(p + 'R',maze, r, c+ 1);
    }
}
}

