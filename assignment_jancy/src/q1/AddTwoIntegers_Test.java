package q1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTwoIntegers_Test {

		AddTwoIntegers_Jancy add= new AddTwoIntegers_Jancy();
		
		@Test
		void testpositive() {
			int sum= add.add(5, 7);
			assertEquals(12,sum);
		}
		
		@Test
		void testnegative() {
			int sum= add.add(-6, 3);
			assertEquals(-3,sum);
		}	
	}

