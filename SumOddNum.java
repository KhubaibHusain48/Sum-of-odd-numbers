import java.util.Scanner;

public class SumofOddNum {
    public static void main(String[] args) {
        sumdigit();
    }

    public static void sumdigit() {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                continue;
            } else {
                sum += i;
            }
        }
        System.out.println("Sum of odd numbers from 1 to " + n + " is " + sum);
    }

}
