package Arrays;

import java.util.Scanner;

class Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(second(n, a));

        sc.close();
    }

    public static int second(int n, int a[]) {
        int firstlargest, secondlargest;
        if (a[0] > a[1]) {
            firstlargest = a[0];
            secondlargest = a[1];
        } else {
            firstlargest = a[1];
            secondlargest = a[0];
        }

        for (int i = 2; i < n; i++) {
            if (a[i] > firstlargest) {
                secondlargest = firstlargest;
                firstlargest = a[i];
            } else if (a[i] < firstlargest && a[i] > secondlargest) {
                secondlargest = a[i];
            }
        }

        return secondlargest;
    }
}
