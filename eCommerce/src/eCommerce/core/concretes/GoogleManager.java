package eCommerce.core.concretes;

import eCommerce.core.abstracts.GoogleService;
import eCommerce.entities.concretes.User;
import eCommerce.google.Google;

public class GoogleManager implements GoogleService{
	private Google google;

	public GoogleManager(Google google) {
		
		this.google = google;
	}

	@Override
	public boolean sýgnÝn(User user) {
		
		return google.signÝn(user);
	}
	

}
