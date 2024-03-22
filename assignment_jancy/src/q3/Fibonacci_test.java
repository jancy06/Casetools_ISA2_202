package q3;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


public class Fibonacci_test {
    
	@Test
    public void testGenerateFibonacci() {
        int[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        assertArrayEquals(expected, Fibonacci_jancy.generateFibonacci(10));
    }

    @Test
    public void testGenerateFibonacciWithNegativeTerms() {
        assertThrows(IllegalArgumentException.class, () -> Fibonacci_jancy.generateFibonacci(-5));
        }
}