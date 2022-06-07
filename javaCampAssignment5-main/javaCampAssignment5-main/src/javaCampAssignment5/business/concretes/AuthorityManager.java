package javaCampAssignment5.business.concretes;

import java.util.regex.Pattern;

import javaCampAssignment5.business.abstracts.AuthorityService;
import javaCampAssignment5.core.abstracts.AuthService;
import javaCampAssignment5.core.abstracts.EmailService;
import javaCampAssignment5.dataAccess.abstracts.UserDao;
import javaCampAssignment5.entities.concretes.User;

public class AuthorityManager implements AuthorityService{
	
	private AuthService authService;
	private EmailService emailService;
	
	public AuthorityManager(EmailService emailService) {
		this.emailService = emailService;
	}

	public AuthorityManager(AuthService authService, EmailService emailService) {
		super();
		this.authService = authService;
		this.emailService = emailService;
	}

	@Override
	public boolean validFirstName(String firstName) {
		if (firstName.length() >= 2) return true;
        System.out.println("First name cannot be less than 2 character!");
        return false;
	}

	@Override
	public boolean validLastName(String lastName) {
		if (lastName.length() >= 2) return true;
        System.out.println("Last name cannot be less than 2 character!");
        return false;
	}

	@Override
	public boolean validPassword(String password) {
		 if (password.length() >= 6) return true;
	        System.out.println("Password cannot be less than 6 character");
	        return false;
	}

	@Override
	public boolean validEmail(String eMail, UserDao userDao) {
		if (userDao.getByEmail(eMail) != null) {
            System.out.println("Email is used before!");
            return true;
        }
        return false;
	}

	@Override
	public boolean validEmailFormat(String eMail) {
		String emailRegex= "^\\w+(\\.\\w+)*@[a-zA-Z]+(\\.\\w{2,6})+$";
        Pattern pattern = Pattern.compile(emailRegex, Pattern.CASE_INSENSITIVE);
        if (eMail == null) {
            System.out.println("Wrong email format!");
            return false;
        } else if (!pattern.matcher(eMail).matches()) System.out.println("Wrong email format!");
        return true;
	}

	@Override
	public boolean validUser(User user, UserDao userDao) {
		if (authService != null) return authService.validUser();
        if (!validFirstName(user.getFirstName())) return false;
        else if (!validLastName(user.getLastName())) return false;
        else if (!validEmailFormat(user.geteMail())) return false;
        else if (!validPassword(user.getPassword())) return false;
        else if (validEmail(user.geteMail(), userDao)) return false;
        emailService.sendVerificationMail(user.geteMail());
        System.out.println("Verified✓");
        return true;
    }
	

	@Override
	public boolean validCorrectUserLogin(String eMail, String password, UserDao userDao) {
		 if (authService != null) return authService.validUser();
	        User user = userDao.getByEmail(eMail);
	        if (user == null) {
	            System.out.println("Incorrect e-mail!");
	            return false;
	        } else if (!user.getPassword().equals(password)) {
	            System.out.println("Incorrect password!");
	            return false;
	        }
	        return true;
	}

	

}
