package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println(getMazePaths(0, 0, 2, 2));
        System.out.println(solve(0, 0, 2, 6));
    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        ArrayList<String> list = new ArrayList<>();
        solve(sr, sc, dr, dc, list, "");
        return list;
    }

    public static void solve(int sr, int sc, int dr, int dc, ArrayList<String> list, String asf) {

        if (sr > dr || sc > dc) {
            return;
        }

        if (sr == dr && sc == dc) {
            list.add(asf);
            return;
        }

//        2 calls

//        right
        solve(sr, sc+1, dr, dc, list, asf+"h");
//        down
        solve(sr+1, sc, dr, dc, list, asf+"v");
    }

    public static int uniquePaths(int m, int n) {
        return -1;
    }

    public static int solve(int sr, int sc, int dr, int dc) {

        if (sr > dr || sc > dc) {
            return 0;
        }

        if (sr == dr && sc == dc) {
            return 1;
        }

//        2 calls

//        right
        int total = 0;
        total += solve(sr, sc+1, dr, dc);
//        down
        total += solve(sr+1, sc, dr, dc);
        return total;
    }
}
