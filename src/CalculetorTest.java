import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import application.Functions;

public class CalculetorTest {

	/**
     * Sets up the test fixture. 
     * (Called before every test case method.)
     * @throws SQLException 
     */
    @Before
    public void setUp() {
    }
 
    /**
     * Tears down the test fixture. 
     * (Called after every test case method.)
     * @throws SQLException 
     */
    @After
    public void tearDown(){
    	
    }
    
	@Test
	void testSum() {
		Float result;
		Float expected;
		Float num1 = Float.parseFloat("6");
		Float num2 = Float.parseFloat("11");
		String op = "+";
		expected = Float.parseFloat("17");
		result = Functions.sumOrSub(num1, num2, op);
		assertEquals(expected, result);
	}

	@Test
	void testSubFunctions() {
		Float result;
		Float expected;
		Float num1 = Float.parseFloat("11");
		Float num2 = Float.parseFloat("6");
		String op = "jj";
		expected = Float.parseFloat("5");
		result = Functions.sumOrSub(num1, num2, op);
		assertEquals(expected, result);
	}
	
	@Test
	void testDefault() {
		Functions func = new Functions();
		Float result;
		Float expected;
		Float num1 = Float.parseFloat("11");
		Float num2 = Float.parseFloat("6");
		String op = "niente";
		expected = Float.parseFloat("0");
		result = Functions.sumOrSub(num1, num2, op);
		assertEquals(expected, result);
	}
	
}
