package Day1_Programs;
import java.util.Scanner;

public class ContinueStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number to skip: ");
        int skipNumber = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            if (i == skipNumber) {

                continue;
            }
            System.out.println(i);
        }

        scanner.close();
    }
}
