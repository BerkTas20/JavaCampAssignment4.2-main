package javaCampAssignment5.business.abstracts;

import javaCampAssignment5.entities.concretes.User;

public interface UserService  {

	void register(User user);
	void login(String eMail, String password);
	void update(User user);
	void delete(User user);
}
