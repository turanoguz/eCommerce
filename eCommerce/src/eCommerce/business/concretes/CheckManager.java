package eCommerce.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerce.business.abstracts.CheckService;
import eCommerce.entities.concretes.User;



public class CheckManager implements CheckService{
	

	

	@Override
	public boolean validEmail(String email) {
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(email);

		if (!matcher.matches()) {
			//System.out.println("L�tfen mail format�nda giriniz .");
			return false;
		}
		return true;
	}

	
	@Override
	public boolean isValid(User user) {
		if(user.getFirstName().length()<2) {
			System.out.println("Kullan�c� ad� en az 2 karakter olmal�d�r.");
			return false;
		}
		if(user.getLastName().length()<2) {
			System.out.println("Kullan�c� soyad� en az 2 karakter olmal�d�r.");
			return false;
		}
		if(user.getPassword().length()<6) {
			System.out.println("Parola en az 6 karakter olmal�d�r.");
			return false;
		}
		if(!validEmail(user.getEmail())) {
			System.out.println("L�tfen e posta format�nda giriniz.");
			return false;
		}
		return true;
	}

}
