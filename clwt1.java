package Lab6;

import java.util.Scanner;

public class clwt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(degree(n));
    }

    static int degree(int n){
        if (n == 0){
            return 1;
        }
        int result;
        result = n * n;
        n = degree(n-1);
        System.out.println(result);
        return result;
    }
}

