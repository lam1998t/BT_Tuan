public class Fibonacci {
    public static  int fibonacci(int n){
        int f0 = 0;
        int f1 = 1;
        if (n < 0){
            return -1;
        }
        if (n == 0 || n == 1){
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
