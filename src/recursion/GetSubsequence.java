package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(generateSubsequences(str));
    }


    public static ArrayList<String> generateSubsequences(String str) {
        // write your code here
        ArrayList<String> list = new ArrayList<>();
        solve(str, 0, "", list);
        return list;
    }

    public static void solve(String str, int idx, String asf, ArrayList<String> list) {
        if (idx == str.length()) {
            if (!asf.equals(""))
                list.add(asf);
            return;
        }

        char ch = str.charAt(idx);

//        pick
        solve(str, idx+1, asf+ch, list);
//        not pick
        solve(str, idx+1, asf, list);
    }
}
