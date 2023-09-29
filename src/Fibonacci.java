import java.util.Scanner;

public class Fibonacci {
    private static int length;
    private static int result;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("add meg a sor hosszát:");
        length = scn.nextInt();

        int fibo = fibonacci();
        System.out.println("Az eredmény ciklussal: " + fibo);
        fibo = fibonacciRec();
        System.out.println("Az eredmény rekurzívan: " + fibo);
    }

    private static int fibonacci(){
        int current0 = 0;
        int current1 = 1;
        for(int i = 0; i < length;i++){
            if(current0 >= current1){
                current1 = current0+current1;
            } else {
                current0 = current1+current0;
            }
        }
        if(length % 2 == 0){
            result = current0;
        } else {
            result = current1;
        }
        return result;
    }

    private static int fibonacciRec(){
        iteration(0,1,0);
        return result;
    }

    private static void iteration(int c0,int c1,int i){
        if(i < length) {
            if(c0 >= c1){
                c1 = c0+c1;
            } else {
                c0 = c1+c0;
            }
            i++;
            iteration(c0,c1,i);
        } else if(length % 2 == 0){
            result = c0;
        } else {
            result = c1;
        }

    }
}