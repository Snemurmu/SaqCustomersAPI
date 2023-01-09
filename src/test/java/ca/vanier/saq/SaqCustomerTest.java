package ca.vanier.saq;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for SaqCustomer.
 */
public class SaqCustomerTest 
{
    @Test
    public void registerRichardMorethan18()
    {
        SaqCustomerRepo repo = new SaqCustomerRepo();
        boolean registered = repo.registerCustomer("Richard", "Bach", 37);
        assertTrue( registered );
    }

    /**
     * Testing registering Tracy who is less than 18 years
     */
    @Test
    public void registerTracyLessThan18()
    {
        SaqCustomerRepo repo = new SaqCustomerRepo();
        boolean registered = repo.registerCustomer("Tracy", "Smith", 17);
        assertFalse( registered );
    }
}
