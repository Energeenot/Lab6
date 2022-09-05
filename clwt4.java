package Lab6;

import java.util.Scanner;

public class clwt4 {

    public static Scanner scanner = new Scanner(System.in);

    static int[] fill_array(int[] array, int n){
        System.out.println("Введите элементы массива");
        if (n > 0){
            array[n-1] = scanner.nextInt();
            fill_array(array, n-1);
        }
        return array;
    }

    static void array_output(int[] array, int n){
        if (n > 0){
            array_output(array, n-1);
            System.out.print(array[n-1] + " ");
        }
    }

    static boolean is_positive(int[] array, int  n){
        System.out.println("Есть ли положительные элементы в массиве?");
        if (array[n-1] > 0){
            return true;
        }
        else if (n == 0) return false;
        return is_positive(array, n-1);
    }

    static boolean is_not_negative(int[] array, int n){
        if (n == 0){
            return true;
        }
        if (array[n-1] < 0){
            return false;
        }
        else return is_positive(array, n-1);
    }

    static boolean is_more(int[] array, int n){
        System.out.println("С каким числом нужно сравнить");
        int k = scanner.nextInt();
        if (array[n-1] > k){
            return true;
        }
        if (n == 0){
            return false;
        }
        else return is_positive(array, n-1);
    }

    static int is_min(int[] array, int n, int min){
        if (n == 0){
            return min;
        }
        if (array[n-1] < min){
            min = array[n-1];
        }
        return is_min(array, n-1, min);
    }

    static int is_max(int[] array){
        if (array.length == 1) return array[0];
        int[] another_array = new int[array.length];
        System.arraycopy(array, 0, another_array, 0, array.length / 2);
        int[] one_more_array = new int[array.length- array.length / 2];
        System.arraycopy(array, array.length/2, one_more_array, 0, array.length - array.length / 2);
        return Math.max(is_max(another_array), is_max(one_more_array));
    }



    public static void main(String[] args) {
        int min = 1000000000;
        System.out.println("Введите размерность массива");
        int n = scanner.nextInt();
        int[] array = new int[n];
        fill_array(array, n);
        array_output(array, n);
        System.out.println();
        is_positive(array, n);
        is_not_negative(array, n);
        is_more(array, n);
        System.out.println(is_min(array, n, min));
        System.out.println(is_max(array));
    }
}
