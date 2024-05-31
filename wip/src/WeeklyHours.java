import java.util.*;

public class WeeklyHours {
    public static void main(String[] args) {
        // Sample array of work hours (8 employees, 7 days)
        int[][] workHours = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}
        };

        // Calculate total hours for each employee
        List<EmployeeHours> employeeHoursList = new ArrayList<>();
        for (int i = 0; i < workHours.length; i++) {
            int totalHours = 0;
            for (int j = 0; j < workHours[i].length; j++) {
                totalHours += workHours[i][j];
            }
            employeeHoursList.add(new EmployeeHours(i, totalHours));
        }

        // Sort employees by total hours
        Collections.sort(employeeHoursList);

        // Display employees and their total hours
        System.out.println("Employees and their total hours (sorted by total hours):");
        for (EmployeeHours employee : employeeHoursList) {
            System.out.println("Employee " + employee.getId() + ": " + employee.getTotalHours() + " hours");
        }
    }
}

// Class to represent an employee's total hours
class EmployeeHours implements Comparable<EmployeeHours> {
    private int id;
    private int totalHours;

    public EmployeeHours(int id, int totalHours) {
        this.id = id;
        this.totalHours = totalHours;
    }

    public int getId() {
        return id;
    }

    public int getTotalHours() {
        return totalHours;
    }

    @Override
    public int compareTo(EmployeeHours other) {
        // Compare total hours for sorting
        return Integer.compare(this.totalHours, other.totalHours);
    }
}
