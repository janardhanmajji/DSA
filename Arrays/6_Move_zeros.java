package Arrays;

import java.util.Scanner;

class MoveZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        moveTOEnd(n, a);
        sc.close();
    }

    public static void moveTOEnd(int n, int a[]) {
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                for (int j = i + 1; j < n; j++) {
                    if (a[j] != 0) {
                        swap(a[i], a[j]);
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }

    public static void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
    }
}
