package Day1_Programs;
import java.util.Scanner;

public class BreakStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number to break the loop: ");
        int breakNumber = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            if (i == breakNumber) {
                break;
            }
            System.out.println(i);
        }

        scanner.close();
    }
}
