package javaCampAssignment5.dataAccess.abstracts;

import java.util.List;

import javaCampAssignment5.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(User user);
	
	List<User>getAll();
	User getById(int id);
	User getByEmail(String eMail);
}
