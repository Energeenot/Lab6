package Lab6;

import java.util.Scanner;

public class greatFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factorial(n));
    }

    static int factorial(int n){
        int result = 1;
        if (n == 0){
            System.out.print(" = ");
            return result;
        }
        if (n == 1){
            System.out.print(" * 1 = ");
            return result;
        }
        System.out.print(n);
        if (n != 2){
            System.out.print(" * ");
        }
        result = n * factorial(n - 1);
        return result;
    }
}
