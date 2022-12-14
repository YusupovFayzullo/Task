package ml.singletons;

public class User {


	private String id;
	private String username;
	private String password;
	private String email;
	private int  age;

	public static  User instance;


	public User(String id, String username, String password, String email, int age) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void setInstance(User instance) {
		User.instance = instance;
	}

	public User getInstance(){
		if(instance==null){
			return new User();
		}

		return instance;
	}

}
