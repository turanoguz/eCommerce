package eCommerce.dataAcces.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerce.dataAcces.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class DatabaseUserDao implements UserDao{
	private List<User> userList;
	

	public DatabaseUserDao() {
		this.userList=new ArrayList<User>();
	}

	@Override
	public void add(User user) {
		userList.add(user);
		System.out.println("Kullanýcý veritabanýna kaydedildi. "+user.getFirstName());
		
	}

	@Override
	public boolean emailCheck(String email) {
		boolean value = false;
		for(User u:userList) {
			if(email.equals(u.getEmail())) {
				System.out.println("Bu eposta zaten sisteme kayýtlý."+email);
				value = false;
			}
			else {
				
				value =true;
			}
		}
		return value;
		
	}

	@Override
	public void login(User user) {
		
		for (User u : userList) {
			if(user.getEmail().equals(u.getEmail())&user.getPassword().equals(u.getPassword())) {
				System.out.println("Giriþ yapýldý : "+user.getEmail());
				
			}
			else {
				System.out.println("Giriþ baþarýsýz e mail veya parola hatalý");
				
				
			}
			
		}
		
	}

	@Override
	public void delete(User user) {
		userList.remove(userList.indexOf(user));
		System.out.println("Kullanýcý silindi .");
		
	}

	@Override
	public void update(User user) {
		userList.set(userList.indexOf(user), user);
		System.out.println("Kullanýcý güncellendi. "+user.getFirstName());
		
	}

}
