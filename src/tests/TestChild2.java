package tests;
import model.Child;
import model.ChildLogic;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Child;
import model.ChildLogic;

// AJ Abrahamsen

public class TestChild2 {
	ChildLogic childLogic = new ChildLogic();
	Child child = new Child("Oliver");

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSchoolLevel() {
		child.setGradeLevel(2);
		String schoolLevel = "Elementary School";
		assertEquals(schoolLevel, childLogic.schoolLevel(child));
	}

}
