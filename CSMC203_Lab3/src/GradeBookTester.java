import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	private GradeBook gradeBookObjOne;
	private GradeBook gradeBookObjTwo;

	@BeforeEach
	void setUp() throws Exception {
		//Creating two objects 
		gradeBookObjOne = new GradeBook(5);
		gradeBookObjTwo = new GradeBook(5);
		
		gradeBookObjOne.addScore(95.0);
		gradeBookObjOne.addScore(85.0);
		
		gradeBookObjTwo.addScore(64.0);
		gradeBookObjTwo.addScore(98.0);

	}

	@AfterEach
	void tearDown() throws Exception {
		gradeBookObjOne = null;
		gradeBookObjTwo = null;

	}

	@Test
	void testGetScoreSize() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testAddScore() {
		fail("Not yet implemented");
	}

	@Test
	void testSum() {
		fail("Not yet implemented");
	}

	@Test
	void testMinimum() {
		fail("Not yet implemented");
	}

	@Test
	void testFinalScore() {
		fail("Not yet implemented");
	}

}
