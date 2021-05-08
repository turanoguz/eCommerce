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
		System.out.println("Kullan�c� veritaban�na kaydedildi. "+user.getFirstName());
		
	}

	@Override
	public boolean emailCheck(String email) {
		boolean value = false;
		for(User u:userList) {
			if(email.equals(u.getEmail())) {
				System.out.println("Bu eposta zaten sisteme kay�tl�."+email);
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
				System.out.println("Giri� yap�ld� : "+user.getEmail());
				
			}
			else {
				System.out.println("Giri� ba�ar�s�z e mail veya parola hatal�");
				
				
			}
			
		}
		
	}

	@Override
	public void delete(User user) {
		userList.remove(userList.indexOf(user));
		System.out.println("Kullan�c� silindi .");
		
	}

	@Override
	public void update(User user) {
		userList.set(userList.indexOf(user), user);
		System.out.println("Kullan�c� g�ncellendi. "+user.getFirstName());
		
	}

}
