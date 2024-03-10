package Arrays;

import java.util.Scanner;

class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(secondlargest(n, a));
        sc.close();
    }

    public static int secondlargest(int n, int a[]) {
        int first = largest(a, n);
        int sec = Integer.MIN_VALUE;
        int idx = -99;
        for (int i = 0; i < n; i++) {
            if (a[i] > sec && a[i] != first) {
                sec = a[i];
                idx = i;
            }
        }
        if (idx == -99)
            return -1;
        else
            return idx;

    }

    public static int largest(int a[], int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] > max)
                max = a[i];
        }

        return max;
    }
}
