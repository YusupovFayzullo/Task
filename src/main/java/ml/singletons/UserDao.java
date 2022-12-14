package ml.singletons;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)

public class UserDao {

	private List<String> names=new ArrayList<>();


	private static  UserDao instance=new UserDao();


	public static UserDao getInstance(){

		return instance;
	}


	public void create(String name){
		names.add(name);
	}

}
