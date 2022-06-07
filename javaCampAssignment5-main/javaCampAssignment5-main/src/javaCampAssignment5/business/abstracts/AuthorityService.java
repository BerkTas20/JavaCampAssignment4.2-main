package javaCampAssignment5.business.abstracts;

import javaCampAssignment5.dataAccess.abstracts.UserDao;
import javaCampAssignment5.entities.concretes.User;

public interface AuthorityService {
	
	boolean validFirstName(String firstName);
	boolean validLastName(String lastName);
	boolean validPassword(String password);
	boolean validEmail(String eMail , UserDao userDao );
	boolean validEmailFormat(String eMail );
	boolean validUser(User user, UserDao userDao );
	boolean validCorrectUserLogin(String eMail, String password, UserDao userDao);

}
