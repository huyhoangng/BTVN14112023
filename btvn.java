import java.util.Scanner;

public class btvn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên x: ");
        int x = scanner.nextInt();

        // Tìm và in ra số nguyên tố lớn nhất trước x
        int result = findLargestPrimeBefore(x);
        System.out.println("Số nguyên tố lớn nhất trước " + x + " là: " + result);
    }
    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    private static int findLargestPrimeBefore(int x) {
        if (x <= 2) {
            // Không có số nguyên tố trước 2
            return -1;
        }
        for (int i = x - 1; i >= 2; i--) {
            if (isPrime(i)) {
                return i;
            }
        }
        return 0;
    }
}
