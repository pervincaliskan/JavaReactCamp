package javaCampHomeWork3;

public class InstructorManager {
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " is added");
	}

	public void remove(Instructor[] instructors, String instructorId) {
		for (Instructor instructor : instructors) {

			if (instructor.getId().equals(instructorId) && instructor.isActive) {
				instructor.setActive(false);
				System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " is removed");
				break;
			}

		}
	}
	
	public void getAll(Instructor[] instructors) {
		for (Instructor instructor : instructors) {
			System.out.println(instructor.toString());
		}
	}
}
