import java.util.Scanner;

public class CalculateIncomeTax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your earning");

        Employee employee = new Employee(sc.nextInt());
        int earning = employee.getEarning();

        System.out.println("Income Tax is Rs. " + incomeTax(earning));
    }

    //method to calculate Income Tax
    private static double incomeTax(int salary) {
        double tax;
        if (salary <= 50000) {
            tax = 0;
        } else if (salary <= 60000) {
            tax = .1 * (salary - 50000);
        } else if (salary <= 150000) {
            tax = 1000 + .2 * (salary - 60000);
        } else {
            tax = 1000 + 18000 + .3 * (salary - 150000);
        }
        return tax;
    }
}
