package questions;

import java.util.Arrays;
import java.util.Scanner;

public class WavaArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr =  {2,4,7,8,9,10};
        int n = arr.length;
        convertToWave(n, arr);
        System.out.println(Arrays.toString(arr));
    }
//4 2 8 7 10 9.
    public static void convertToWave(int n, int[] a) {
        // code here
        int i = 0;
        while (i < n - 1) {
            int temp = a[i];
            a[i] = a[i+1];
            a[i+1] = temp;
            i=i+2;
        }
    }
}
