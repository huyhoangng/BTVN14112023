import java.util.Scanner;

public class numbercheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên n từ người dùng
        System.out.print("Nhập số nguyên n: ");
        int n = scanner.nextInt();

        // Tìm và in ra chữ số thứ n trong dãy Fibonacci
        int result = findFibonacciDigit(n);
        System.out.println("Chữ số thứ " + n + " trong dãy Fibonacci là: " + result);

        // Đóng Scanner
        scanner.close();
    }

    // Phương thức tìm chữ số thứ n trong dãy Fibonacci
    private static int findFibonacciDigit(int n) {
        if (n <= 0) {
            System.out.println("Vui lòng nhập một số nguyên dương.");
            return -1;
        }

        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        return b % 10; // Lấy chữ số cuối cùng của số Fibonacci
    }
}
