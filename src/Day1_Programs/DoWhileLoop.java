package Day1_Programs;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();

        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= limit);

        scanner.close();
    }
}
