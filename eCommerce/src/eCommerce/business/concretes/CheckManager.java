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
			//System.out.println("Lütfen mail formatýnda giriniz .");
			return false;
		}
		return true;
	}

	
	@Override
	public boolean isValid(User user) {
		if(user.getFirstName().length()<2) {
			System.out.println("Kullanýcý adý en az 2 karakter olmalýdýr.");
			return false;
		}
		if(user.getLastName().length()<2) {
			System.out.println("Kullanýcý soyadý en az 2 karakter olmalýdýr.");
			return false;
		}
		if(user.getPassword().length()<6) {
			System.out.println("Parola en az 6 karakter olmalýdýr.");
			return false;
		}
		if(!validEmail(user.getEmail())) {
			System.out.println("Lütfen e posta formatýnda giriniz.");
			return false;
		}
		return true;
	}

}
