package tests;
import model.Child;
import model.ChildLogic;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

// AJ Abrahamsen

public class TestChild1 {
	ChildLogic childLogic = new ChildLogic();
	Child child = new Child("Oliver");
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testChildIsOfDrivingAge() {
		child.setAge(17);
		assertTrue(childLogic.drivingAge(child));
	}
	
	@Test
	public void testChildIsNotOfDrivingAge() {
		child.setAge(10);
		assertFalse(childLogic.drivingAge(child));
	}

}
