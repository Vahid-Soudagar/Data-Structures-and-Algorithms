package recursion;

import java.util.Scanner;

public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n) {

//        i can take 0 steps
        if (n == 0) {
            return 0;
        }

//        1 steps
        if (n == 1) {
            return 1;
        }

//        2 steps
        if (n == 2) {
            return 2;
        }

//        add all the steps and return the steps count
        int steps = 0;
        steps += climbStairs(n-1);
        steps += climbStairs(n - 2);
        return steps;
    }
}
