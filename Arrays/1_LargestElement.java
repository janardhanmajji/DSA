package Arrays;

import java.util.Scanner;

class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(largestelement(n, a));
    }

    public static int largestelement(int n, int a[]) {
        int max = Integer.MIN_VALUE;
        // int ind = -99;
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
                // ind = i;
            }
        }

        return max;
    }
}