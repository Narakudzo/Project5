package N27;

import java.util.Scanner;

public class Namber15 {
    public static int recursion(int n) {
        // Базовый случай
        if (n < 10) {
            return n;
        }// Шаг рекурсии / рекурсивное условие
        else {
            System.out.print(n % 10 + " ");
            return recursion(n / 10);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(recursion(n)); // вызов рекурсивной функции
    }
}
