package Arrays;

import java.util.Scanner;

class Sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(checkSorted(n, a));
        sc.close();
    }

    public static boolean checkSorted(int n, int a[]) {
        int flag = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i + 1] > a[i])
                flag = 0;
            else {
                flag = 1;
                break;
            }
        }

        if (flag == 1)
            return false;
        else
            return true;
    }
}
