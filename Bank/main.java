import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<Account> accounts = new ArrayList<Account>();
        Scanner scan = new Scanner(System.in);
        System.out.printf("How many Checking accounts: ");
        int count = scan.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.printf("Customer #: ");
            int num = scan.nextInt();
            System.out.printf("Balance: ");
            double balance = scan.nextDouble();
            accounts.add(new Checking(num, balance));
        }

        System.out.printf("How many Savings accounts: ");
        int count2 = scan.nextInt();

        for (int i = 0; i < count2; i++) {
            System.out.printf("Customer #: ");
            int num = scan.nextInt();
            System.out.printf("Balance: ");
            double balance = scan.nextDouble();
            accounts.add(new Savings(num, balance));
        }
    }
}
