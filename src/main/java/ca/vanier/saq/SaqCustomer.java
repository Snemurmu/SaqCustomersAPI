package ca.vanier.saq;

/**
 * This is the class that stores first name, last name and age.
 */
public class SaqCustomer {
    // First name
    private String fname;
    // Last name
    private String lname;
    // age
    private int age;    
    
    /**
     * Constructor
     * @param fname
     * @param lname
     * @param age
     */
    public SaqCustomer(String fname, String lname, int age) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
            
}
