package Day1_Programs;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // scanner = input year
        // if condition year%4=0 then leap year , or non leap

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if(year%4==0)
        {
            System.out.println("Leap Year");

        }
        else
            System.out.println("Non leap year");
    }
}
