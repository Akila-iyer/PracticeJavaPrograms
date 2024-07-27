package Day1_Programs;
import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();

        int i = 1;
        while (i <= limit) {
            System.out.println(i);
            i++;
        }

        scanner.close();
    }

}
