package q4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Count_num_test {
	
	Count_num_jancy count= new Count_num_jancy();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	  @Test
	    public void testCountDigitsPositive() {
	        assertEquals(4, count.Count_num_jancy(1234));
	    }

	    @Test
	    public void testCountDigitsZero() {
	        assertEquals(1, count.Count_num_jancy(0));
	    }
	}
