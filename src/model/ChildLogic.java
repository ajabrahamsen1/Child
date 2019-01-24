package model;

// AJ Abrahamsen

public class ChildLogic {

	public boolean drivingAge(Child child) {
		if (child.getAge() < 16) {
			return false;
		}else {
			return true;
		}
	}
	
	public String schoolLevel(Child child) {
		if (child.getGradeLevel() < 1) {
			return "Preschool";
		}else if (child.getGradeLevel() >= 1 && child.getGradeLevel() <= 4) {
			return "Elementary School";
		}else if (child.getGradeLevel() >= 5 && child.getGradeLevel() <= 8) {
			return "Middle School";
		}else {
			return "High School";
		}
	}
}
