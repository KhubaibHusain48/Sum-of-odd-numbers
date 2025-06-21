import java.util.Scanner;

public class OddSumWithDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number n: ");
        int n = sc.nextInt();

        int sum = 0;

        System.out.print("Odd numbers from 1 to " + n + ": ");
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
            sum += i;
        }

        System.out.println("\nSum of odd numbers: " + sum);
    }
}
