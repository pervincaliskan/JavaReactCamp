package javaCampHomeWork3;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " is added");
	}

	public void remove(User[] users, String userId) {
	
		for (User user : users) {
			if (user.getId().equals(userId) && user.isActive) {
				user.setActive(false);
				System.out.println(user.getFirstName() + " " + user.getLastName() + " is removed");
				break;
			}
		}
	}

	public void getAll(User[] users) {
		for (User user : users) {
			System.out.println(user.toString());
		}
	}
}
