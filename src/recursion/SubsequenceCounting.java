package recursion;

import java.util.Scanner;

public class SubsequenceCounting {
    public static int numberOfOccurrences(String s, String p) {
        // int count = 0;
        int count = solve(s, p, "", 0);
        return count;
    }


    public int solve(String s, String p, int sIdx, int pIdx) {
        if (pIdx == p.length()) {
            return 1;
        }

        if (sIdx == s.length()) {
            return 0;
        }

        int count = 0;

        if (s.charAt(sIdx) == p.charAt(pIdx)) {
            count += solve(s, p, sIdx+1, pIdx+1);
        }

        count += solve(s, p, sIdx+1, pIdx);

        return count;
    }

    public static int solve(String s, String p, String asf, int idx) {
        if (idx == s.length()) {
            if (asf.equals(p))  return 1;
            return 0;
        }

        // char
        char ch = s.charAt(idx);
        // pick
        int c = solve(s, p, asf+ch, idx+1);
        // not pick
        c = c + solve(s, p, asf, idx+1);

        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String p = sc.next();

        System.out.println(numberOfOccurrences(s, p));
    }
}
