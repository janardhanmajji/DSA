package Arrays;

import java.util.*;

class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] ans = remove_duplicates(n, a);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        sc.close();
    }

    public static int[] remove_duplicates(int n, int a[]) {
        Set<Integer> st = new HashSet<>();
        for (int i = 0; i < n; i++) {
            st.add(a[i]);
        }

        ArrayList<Integer> al = new ArrayList<Integer>(st);

        int size = st.size();
        int ans[] = new int[size];
        for (int i = 0; i < size; i++) {
            ans[i] = al.get(i);
        }

        return ans;
    }
}
