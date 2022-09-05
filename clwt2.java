package Lab6;

import java.util.Scanner;

public class clwt2 {
    public static void main(String[] args) {
        posled(1);
    }

    static void posled(int n){
        Scanner scanner = new Scanner(System.in);
        if (n != 0){
            n = scanner.nextInt();
            posled(n);
            if(n != 0)
                System.out.println(n);
        }

    }
}
