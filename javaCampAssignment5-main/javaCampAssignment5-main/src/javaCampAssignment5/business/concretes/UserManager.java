package javaCampAssignment5.business.concretes;

import javaCampAssignment5.business.abstracts.AuthorityService;
import javaCampAssignment5.business.abstracts.UserService;
import javaCampAssignment5.dataAccess.abstracts.UserDao;
import javaCampAssignment5.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	private AuthorityService authorityService;
	
	public UserManager(UserDao userDao, AuthorityService authorityService) {
		super();
		this.userDao = userDao;
		this.authorityService = authorityService;
	}
	

	@Override
	public void register(User user) {
		if(authorityService.validUser(user, userDao)) {
			userDao.add(user);
			System.out.println("Registration was completed successfully! ");
			return;
		}
		System.out.println("Registration Failed! ");
	}


	@Override
	public void login(String eMail, String password) {
		if(authorityService.validCorrectUserLogin(eMail, password, userDao)) {
			System.out.println("User successfully logged in! ");
			return;
		}
		System.out.println("Login Failed! ");
	}


	@Override
	public void update(User user) {
		if(authorityService.validUser(user, userDao)) {
			userDao.update(user);
			System.out.println("User successfully updated! ");
			return;
		}
		System.out.println("Update Failed! ");
	}


	@Override
	public void delete(User user) {
		userDao.delete(user);
		System.out.println("Successfully deleted! ");
		
	}
	
	
	
}
