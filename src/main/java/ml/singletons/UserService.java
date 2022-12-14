package ml.singletons;


import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserService {

	private static Lock lock=new ReentrantLock();


	private static UserService instance;


	public static UserService getInstance(){
		try {
			lock.lock();

			if(instance==null){
				instance=new UserService();
			}
		} finally {
			lock.unlock();
		}

		return  instance;
	}




}
