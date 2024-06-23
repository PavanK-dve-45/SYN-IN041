import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (isPrime(num) == true) {
            System.out.println(num + " Is a Prime number");
        } else {
            System.out.println(num + " Is not a Prime number");
        }
        sc.close();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else if (n > 2 && n % 2 == 0) {
            return false;
        } else if (n > 1) {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}