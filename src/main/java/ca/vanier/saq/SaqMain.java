package ca.vanier.saq;

import java.util.Scanner;

/**
 * SAQ Customer System
 *
 */
public class SaqMain {
    public static void main(String[] args) {
        System.out.println("\n**** This is the Saq Customer System *****");

        SaqCustomerRepo repo = new SaqCustomerRepo();

        Scanner scanner = new Scanner(System.in);
        boolean loop = true;

        while (loop) {
            System.out.println("\nEnter 'sav' or 'list' : if 'sav' then please enter first name, last name and age:");

            // String input
            String option = scanner.next();
            if ("sav".equalsIgnoreCase(option)) {
                String fname = scanner.next();
                String lname = scanner.next();
                int age = scanner.nextInt();

                repo.registerCustomer(fname, lname, age);

            } else if ("list".equalsIgnoreCase(option)) {
                loop = false;
                repo.listCustomers();
            }
        }
        scanner.close();
    }
}
