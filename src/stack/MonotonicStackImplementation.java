package stack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class MonotonicStackImplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        implementMonotonicStack(str);
    }

    public static Stack<Character> implementMonotonicStack(String str) {
        int n = str.length();
        Stack<Character> stack = new Stack<>();
        ArrayList<Character> list = new ArrayList<>();

        for (int i=0;i<n;i++) {
            char ch = str.charAt(i);
            while (!stack.isEmpty() && ch < stack.peek()) {
                list.add(stack.pop());
            }
            stack.push(ch);
            while (!list.isEmpty()) {
                stack.push(list.remove(list.size()-1));
            }
        }
        System.out.println(stack);
        return stack;
    }
}
