import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        final double RATE = 16.78;
        final double OVERTIME_MULT = 1.5;
        final double SS_TAX = 0.06;
        final double FED_TAX = 0.14;
        final double STATE_TAX = 0.05;
        final double UNION_DUES = 10.0;

        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to the Payroll Program!");
        System.out.print("\nHow many hours did you work this week? ");
        double hours = in.nextDouble();
        System.out.print("How many children do you have?  ");
        int dependents = in.nextInt();

        double regularHours = Math.min(40.0, Math.max(0.0, hours));
        double overtimeHours = Math.max(0.0, hours - 40.0);

        double gross = regularHours * RATE + overtimeHours * RATE * OVERTIME_MULT;

        double socSec = round2(gross * SS_TAX);
        double fedTax = round2(gross * FED_TAX);
        double stTax = round2(gross * STATE_TAX);
        double union = UNION_DUES;
        double ins = dependents >= 3 ? 35.0 : 15.0;

        double net = round2(gross - (socSec + fedTax + stTax + union + ins));

        System.out.println("\nPayroll Stub:\n");
        System.out.printf("   Hours:   %.1f%n", hours);
        System.out.printf("    Rate:   %.2f $/hr%n", RATE);
        System.out.printf("   Gross:   $ %.2f%n%n", gross);
        System.out.printf("  SocSec:   $ %.2f%n", socSec);
        System.out.printf("  FedTax:   $ %.2f%n", fedTax);
        System.out.printf("   StTax:   $ %.2f%n", stTax);
        System.out.printf("   Union:   $ %.2f%n", union);
        System.out.printf("     Ins:   $ %.2f%n%n", ins);
        System.out.printf("     Net:   $ %.2f%n%n", net);
        System.out.println("Thank you for using the Payroll Program!");
    }

    private static double round2(double x) {
        return Math.round(x * 100.0) / 100.0;
    }
}
