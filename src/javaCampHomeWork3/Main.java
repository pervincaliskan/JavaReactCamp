package javaCampHomeWork3;

import java.util.UUID;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student(UUID.randomUUID().toString(), "Pervin", "Çalýþkan", "peri@gmail.com","15.08.1999" );
		Student student2 = new Student(UUID.randomUUID().toString(), "Yeþim", "Çalýþkan", "ysmclskn@gmail.com", "23.04.1981");
		Student student3 = new Student(UUID.randomUUID().toString(), "Bekir", "Çalýþkan", "bkr01clskn@gmail.com", "06.08.1975");
			
		Student[] students = { student,student2,student3 };

		StudentManager studentManager = new StudentManager();
		
		System.out.println("\n--------Add Students-------\n");
		studentManager.add(student);
		studentManager.add(student2);
		studentManager.add(student3);
		
		System.out.println("\n--------Remove Student-------\n");
		studentManager.remove(students, student.getId());
		
		
		System.out.println("\n--------List of Students-------\n");
		studentManager.getAll(students);
		
		Instructor instructor = new Instructor(UUID.randomUUID().toString(), "Engin", "Demiroð", "engind@gmail.com","15.01.1945" );
		Instructor instructor2 = new Instructor(UUID.randomUUID().toString(), "Atýl", "Samancýoðlu", "atýls@gmail.com", "23.04.1981");
		Instructor instructor3 = new Instructor(UUID.randomUUID().toString(), "Þadi", "Enver", "sadienvern@gmail.com", "06.08.1975");
			
		Instructor[] instructors = { instructor,instructor2,instructor3 };
		
		InstructorManager instructorManager = new InstructorManager();
		
		System.out.println("\n--------Add Instructor-------\n");
		instructorManager.add(instructor);
		instructorManager.add(instructor2);
		instructorManager.add(instructor3);
		
		System.out.println("\n--------Remove Instructor-------\n");
		instructorManager.remove(instructors, instructor.getId());
		
		
		System.out.println("\n--------List of Instructors-------\n");
		instructorManager.getAll(instructors);
		
		
		User user = new User(UUID.randomUUID().toString(), "Eda", "Ece", "edaece@gmail.com","15.01.1945","test", "test123" );
		User user2 = new User(UUID.randomUUID().toString(), "Þebnem", "Ferah", "sebnemferah@gmail.com", "23.04.1981","test", "test123");
		User user3 = new User(UUID.randomUUID().toString(), "Kemal", "Sunal", "ksunal@gmail.com", "06.08.1975","test", "test123");
			
		User[] users = { user, user2, user3 };
		
		UserManager userManager = new UserManager();
		
		System.out.println("\n--------Add User-------\n");
		userManager.add(user);
		userManager.add(user2);
		userManager.add(user3);
		
		System.out.println("\n--------Remove User-------\n");
		userManager.remove(users, user.getId());
		
		
		System.out.println("\n--------List of User-------\n");
		userManager.getAll(users);
	}
	}


