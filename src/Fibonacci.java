import jdk.jshell.spi.ExecutionControl;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("add meg a sor hosszát:");
        int length = scn.nextInt();

        int fibo = fibonacci(length);
        System.out.println("Az eredmény ciklussal: " + fibo);
        fibo = fibonacciRec(length);
        System.out.println("Az eredmény rekurzívan: " + fibo);
    }

    private static int fibonacci(int n){
        int current0 = 0;
        int current1 = 1;
        for(int i = 0; i < n;i++){
            if(current0 >= current1){
                current1 = current0+current1;
            } else {
                current0 = current1+current0;
            }
        }
        if(n % 2 == 0){
            return current0;
        } else {
            return current1;
        }
    }

    private static int fibonacciRec(int n){
        int current0 = 0;
        int current1 = 1;
        int it = 0;
        Runnable iteration = (int c0,int c1,int i) -> {
            if(i < n) {
                if(c0 >= c1){
                    c0 = c0+c1;
                } else {
                    c1 = c0+c1;
                }
            }
        };
        //todo:finish recursion
        return 0;
    }
}