package eCommerce.business.abstracts;

import eCommerce.entities.concretes.User;

public interface CheckService {
	
	boolean validEmail(String email);
	boolean isValid(User user);

}
