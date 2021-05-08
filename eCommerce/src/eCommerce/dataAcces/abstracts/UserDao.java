package eCommerce.dataAcces.abstracts;

import eCommerce.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	void update(User user);
	boolean emailCheck(String email);
	void login(User user);

}
