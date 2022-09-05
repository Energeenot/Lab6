package Lab6;

import java.util.Scanner;

public class clwt3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(rec(n));
    }

    static double rec(int n){
        double result = 0;
        n--;
        if (n >= 0){
            result = Math.sqrt(2 + rec(2));
        }
        return result;
    }
}
