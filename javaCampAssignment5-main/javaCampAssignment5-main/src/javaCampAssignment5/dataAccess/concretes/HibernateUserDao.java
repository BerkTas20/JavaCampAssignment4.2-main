package javaCampAssignment5.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import javaCampAssignment5.dataAccess.abstracts.UserDao;
import javaCampAssignment5.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	
	List<User> usersInDatabase = new ArrayList<>();
	
	@Override
	public void add(User user) {
		System.out.println("Saved in database by hibernate: " + user.geteMail());
		usersInDatabase.add(user);
	}

	@Override
	public void update(User user) {
		 System.out.println("Saved to database by hibernate: " + user.geteMail());
		 usersInDatabase.add(user);
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Deleted by hibernate: " + user.geteMail());
        usersInDatabase.remove(getById(user.getId()));
		
	}

	@Override
	public List<User> getAll() {
		
		return usersInDatabase;
	}

	@Override
	public User getById(int id) {
		List<User> users = getAll();
        if (users != null) {
            for (User user : users) {
                if (user.getId() == id) return user;
            }
        }
        return null;
	}

	@Override
	public User getByEmail(String eMail) {
		 List<User> users = getAll();
	        if (users != null) {
	            for (User user : users) {
	                if (user.geteMail().equals(eMail)) return user;
	            }
	        }
	        return null;
	}
}
