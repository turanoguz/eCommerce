package eCommerce.business.concretes;

import eCommerce.business.abstracts.CheckService;
import eCommerce.business.abstracts.UserService;
import eCommerce.dataAcces.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class UserManager implements UserService{
	private CheckService check;
	private UserDao database;
	

	public UserManager(CheckService check, UserDao database) {
		
		this.check = check;
		this.database = database;
	}

	@Override
	public void add(User user) {
		//database.add(user);
		if(check.isValid(user)) {
			database.add(user);
			return;
		}
		System.out.println("Kullanýcý kaydedilemedi.");
		
	}

	@Override
	public void delete(User user) {
		database.delete(user);
		
	}

	@Override
	public void update(User user) {
		database.update(user);
		
	}

	@Override
	public void login(User user) {
		database.login(user);
		
	}

}
