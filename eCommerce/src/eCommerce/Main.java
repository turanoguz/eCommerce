package eCommerce;

import eCommerce.business.abstracts.UserService;
import eCommerce.business.concretes.CheckManager;
import eCommerce.business.concretes.UserManager;
import eCommerce.core.abstracts.GoogleService;
import eCommerce.core.concretes.GoogleManager;
import eCommerce.dataAcces.concretes.DatabaseUserDao;
import eCommerce.entities.concretes.User;
import eCommerce.google.Google;

public class Main {
	public static void main(String[] args) {
		User user = new  User("1456", "turan", "asdwe@gmail.com", "124568");
		User user2= new User("osman","hasan","hsan@hotmail.com","4567983");
		
		UserService manager = new UserManager(new CheckManager(),new DatabaseUserDao());
		manager.add(user);
		manager.login(user);
		manager.delete(user);
		
		
		
		GoogleService google=new GoogleManager(new Google());
		
		google.sýgnÝn(user2);
		
		
		
	}

}
