package Array;

public class HighestSalary {
    public static void main(String[] args) {
        // Array of salaries
        int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};

        // Initialize max and min with the first element of the array
        int max = salaries[0];
        int min = salaries[0];

        // Enhanced for loop to find the max and min values
        for (int salary : salaries) {
            if (salary > max) {
                max = salary;
            }
            if (salary < min) {
                min = salary;
            }
        }

        // Print the max and min salaries
        System.out.println("Highest Salary: " + max);
        System.out.println("Lowest Salary: " + min);
    }
}
