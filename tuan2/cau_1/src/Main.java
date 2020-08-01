import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int a, b;
        int n;

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so thu nhat : ");
        a = scanner.nextInt();
        System.out.println("nhap vao so thu hai : ");
        b = scanner.nextInt();
        System.out.println("UCLN : " + UCLN.GCD(a, b));

        System.out.println("nhập vào số nguyên n : ");
        n = scanner.nextInt();

        System.out.println("số fibonacci : "+Fibonacci.fibonacci(n));

        sieveEratosthenes.SieveEratosthenes(n);
    }
}