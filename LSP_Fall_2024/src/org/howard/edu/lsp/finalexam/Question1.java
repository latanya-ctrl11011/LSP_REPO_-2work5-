package org.howard.edu.lsp.finalexam;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Question1 {
	public class MathUtilsTest {

	    @Test
	    public void testFactorialPositive() {
	    	MathUtils mathUtils = new MathUtils();
	        assertEquals(1, mathUtils.factorial(0));
	        assertEquals(1, mathUtils.factorial(1));
	        assertEquals(5040, mathUtils.factorial(5));
	        assertEquals(3628800, mathUtils.factorial(10)); // testing a larger number
	        assertEquals(2432902008176640000L, mathUtils.factorial(20)); // testing a very large number for overflow
	    }

	    @Test
	    public void testFactorialNegative() {
	    	MathUtils mathUtils = new MathUtils();
	        assertThrows(IllegalArgumentException.class, () -> mathUtils.factorial(-1));
	        assertThrows(IllegalArgumentException.class, () -> mathUtils.factorial(Integer.MIN_VALUE));
	        assertThrows(IllegalArgumentException.class, () -> mathUtils.factorial(Integer.MAX_VALUE));
	    }

	    @Test
	    public void testIsPrimePositive() {
	        MathUtils mathUtils = new MathUtils();
	        assertTrue(mathUtils.isPrime(2));
	        assertTrue(mathUtils.isPrime(3));
	        assertTrue(mathUtils.isPrime(17));
	        assertTrue(mathUtils.isPrime(97)); // larger prime numbers
	        
	        assertFalse(mathUtils.isPrime(1)); // edge: 1 isn't a prime
	        
	        assertFalse(mathUtils.isPrime(4)); // edge: even numbers > 2 aren't prime
	        assertFalse(mathUtils.isPrime(100)); 
	    }

	    @Test
	    public void testIsPrimeNegative() {
	        MathUtils mathUtils = new MathUtils();
	        assertFalse(mathUtils.isPrime(0));
	        assertFalse(mathUtils.isPrime(1));
	        assertFalse(mathUtils.isPrime(9));
	        assertFalse(mathUtils.isPrime(Integer.MAX_VALUE)); // Maximum integer value
	    }

	    @Test
	    public void testGcdPositive() {
	        MathUtils mathUtils = new MathUtils();
	        assertEquals(12, mathUtils.gcd(36, 24));
	        assertEquals(1, mathUtils.gcd(15, 4));
	        assertEquals(18, mathUtils.gcd(18, 0));
	        assertEquals(Integer.MAX_VALUE, mathUtils.gcd(Integer.MAX_VALUE, 0)); // Maximum integer value
	    }

	    @Test
	    public void testGcdNegative() {
	        MathUtils mathUtils = new MathUtils();
	        assertEquals(12, mathUtils.gcd(-36, -24));
	        assertEquals(1, mathUtils.gcd(-15, 4));
	        assertThrows(IllegalArgumentException.class, () -> mathUtils.gcd(0, 0));
	        assertThrows(IllegalArgumentException.class, () -> mathUtils.gcd(Integer.MIN_VALUE, 0)); // Minimum integer value
	    }

	    @Test
	    public void testGcdBoundaryCases() {
	        MathUtils mathUtils = new MathUtils();
	        assertEquals(0, mathUtils.gcd(0, Integer.MAX_VALUE));
	        assertEquals(Integer.MAX_VALUE, mathUtils.gcd(Integer.MAX_VALUE, Integer.MAX_VALUE));
	    }
	}

}
