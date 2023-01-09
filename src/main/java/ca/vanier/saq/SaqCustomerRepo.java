package ca.vanier.saq;

import java.util.LinkedList;

public class SaqCustomerRepo {

    private LinkedList<SaqCustomer> customers = new LinkedList<SaqCustomer>();

    /**
     * This method registers a customer in the SaqCustomer service
     * 
     * @param fname
     * @param lname
     * @param age
     * @return
     */
    public boolean registerCustomer(String fname, String lname, int age) {
        boolean retval = false;
        if (age < 18) {
            System.out.println("\nSorry, the customer cannot be registered ");
        } else {
            retval = true;
            System.out.println("\nThe customer is successfully registered\n");
            SaqCustomer customer = new SaqCustomer(fname, lname, age);
            customers.add(customer);
        }
        return retval;
    }

    /**
     * This methods prints the list of all customers
     * 
     * @return
     */
    public int listCustomers() {
        if(customers.size() == 0) {
            System.out.println("********************************************");
            System.out.println("Sorry, there are no customers in the database");
        }
        for (SaqCustomer customer : customers) {
            System.out.println(
                    "The customer is : " + customer.getFname() + " " + customer.getLname() + " " + customer.getAge());
        }
        return customers.size();
    }

}
