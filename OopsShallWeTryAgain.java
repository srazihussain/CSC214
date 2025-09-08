import java.util.Scanner;

public class Validator {

    public static int getIntInRange(int low, int high, String prompt, String errMsg) {
        Scanner scan = new Scanner(System.in);
        int x = 0;
        boolean ok = false;
        while (!ok) {
            System.out.println(prompt);
            if (scan.hasNextInt()) {
                x = scan.nextInt();
                if (x >= low && x <= high) {
                    ok = true;
                } else {
                    System.out.println(errMsg);
                }
            } else {
                scan.next(); 
                System.out.println(errMsg);
            }
        }
        return x;
    }

    public static void main(String[] args) {
        int val1 = getIntInRange(1, 10, "Enter a number 1-10", "Invalid, try again");
        System.out.println("You picked " + val1);
        int val2 = getIntInRange(-5, 5, "Enter -5 to 5", "Nope");
        System.out.println("You picked " + val2);
    }
}
