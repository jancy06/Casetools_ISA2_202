package q6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class persons_test {

	 Persons_jancy person = new Persons_jancy("Alice", 30);
	 
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
		    public void testSetNameAndGetAge() {
		        int age=person.getAge();
		        String name=person.getName();
		        assertEquals("Alice", name);
		        assertEquals(30,age);
		    }
		}
	
