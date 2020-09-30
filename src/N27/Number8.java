package N27;

import java.util.Scanner;

public class Number8 {
    public static String recursion(int n) {
        int sum = 0;
        int j = 0;
        if (n == 1) {
            System.out.print("1");
        } else {
            for (int i = 1; sum < n; i++) {
                sum += i;
                j = i;
            }
            System.out.print(recursion(--n) + " " + j);
        }
        return "";
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        recursion(n);
    }
}
