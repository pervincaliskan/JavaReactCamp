package javaCampHomeWork3;

public class StudentManager {

	public void add(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " is added");
	}

	public void remove(Student[] students, String studentId) {
		for (Student student : students) { //enhanced for loop || 		for(int i = 0; i< students.length; i++)


			if (student.getId().equals(studentId) && student.isActive) {
				student.setActive(false);
				System.out.println(student.getFirstName() + " " + student.getLastName() + " is removed");
				break;
			}

		}
	}
	
	public void getAll(Student[] students) {
		for (Student student : students) {
			System.out.println(student.toString());
		}
	}
}