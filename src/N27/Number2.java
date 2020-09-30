package N27;
import java.util.Scanner;

public class Number2 {
    public static String recursion2(int n) {
        if (n == 1) {
            return "1";
        }
        return recursion2(n - 1) + " " + n;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(recursion2(n));

    }
}
