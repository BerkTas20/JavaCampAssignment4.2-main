package javaCampAssignment5.core.concretes;

import javaCampAssignment5.GoogleAuthSystem.GoogleAuthManager;
import javaCampAssignment5.core.abstracts.AuthService;

public class GoogleAuthManagerAdapter implements AuthService {

	@Override
	public boolean validUser() {
		
		return new GoogleAuthManager().validUserByGoogle();
	}

}
