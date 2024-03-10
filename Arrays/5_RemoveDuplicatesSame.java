package Arrays;

import java.util.Scanner;

class RemoveDuplicatesSame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(remove(n, a));

        sc.close();
    }

    public static int remove(int n, int a[]) {
        int res = 1;
        for (int i = 1; i < n; i++) {
            if (a[res - 1] != a[i]) {
                a[res] = a[i];
                res++;
            }
        }
        return res;
    }
}
