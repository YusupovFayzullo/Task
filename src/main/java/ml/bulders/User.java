package ml.bulders;


import lombok.Builder;
import org.interfaces.B;

public class User {

	private String id;
	private String username;
	private String password;
	private String status;
	private String role;

	public User(String id, String username, String password, String status, String role) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.status = status;
		this.role = role;
	}

	public static Builder builder() {
		return new Builder();
	}


	public static class Builder {
		private String id;
		private String username;
		private String password;
		private String status;
		private String role;


		public Builder id(String id) {
			this.id = id;
			return this;
		}

		public Builder username(String username) {
			this.username = username;
			return this;
		}

		public Builder password(String password) {
			this.password = password;
			return this;
		}

		public Builder status(String status) {
			this.status = status;
			return this;
		}

		public Builder role(String role) {
			this.role = role;
			return this;
		}

		public User build() {
			return new User(this.id, this.username, this.password, this.status, this.role);
		}

	}

	@Override
	public String toString() {
		return "User{" +
				"id='" + id + '\'' +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", status='" + status + '\'' +
				", role='" + role + '\'' +
				'}';
	}

	public static void main(String[] args) {
		Builder builder = User.builder();
		Builder builder2 = User.builder();

		User user1 = builder2.role("user").build();

		User user = builder.id("1").username("ffd").password("123").role("user").status("activ").build();

		System.out.println("user1 = " + user);
		System.out.println("user2 = " + user1);
	}
}