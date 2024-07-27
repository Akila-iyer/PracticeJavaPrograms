package Day1_Programs;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {

        //Type of triangle
        /*
        Equilateral -- all 3 sides equal
        Isoselece -- 2 sides are equal
        Scalene -- No sides are equal
         */
        for (int loop = 1; loop <= 2; ++loop) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter length of 1st side");
            int a = s.nextInt();
            System.out.println("Enter length of 2nd side");
            int b = s.nextInt();
            System.out.println("Enter length of 3rd side");
            int c = s.nextInt();

            if (a == b && b == c)
                System.out.println("Equilateral Triangle");
            else if (a == b || a == c || b == c)
                System.out.println("Isosceles Triangle");
            else
                System.out.println("Scalene Triangle");

        }


    }
}

