package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OldKeypadPhone {

    private static final String[] keys = {"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz", "", "", ""};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String digits = scanner.next();
        List<String> list = letterCombinations(digits);
        System.out.println(list);
    }

    public static List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        solve(digits, 0, "", list);
        return list;
    }
    public static void solve (String digits, int idx, String ans, List<String> list) {

        if (idx == digits.length()) {
            list.add(ans);
            return;
        }

        char ch = digits.charAt(idx);
        String key = keys[(ch - '0' - 1)];

        for (int i=0;i<key.length();i++) {
            char letter = key.charAt(i);
            solve(digits, idx+1, ans+letter, list);
        }
    }
}
