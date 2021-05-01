package javaCampHomeWork3;

public class User extends AbstractBase {

	public String username;
	public String password;
	
	public User(String id, String firstName, String lastName, String email, String birthDate, String username, String password) {
		super(id, firstName, lastName, email, birthDate);
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}