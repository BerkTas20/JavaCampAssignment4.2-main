package javaCampAssignment5;

import javaCampAssignment5.business.concretes.AuthorityManager;
import javaCampAssignment5.business.concretes.UserManager;
import javaCampAssignment5.core.concretes.EmailManager;
import javaCampAssignment5.core.concretes.GoogleAuthManagerAdapter;
import javaCampAssignment5.dataAccess.concretes.HibernateUserDao;
import javaCampAssignment5.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1,"Carl","Johson","CjGtaSanAndreas@gmail.com","159753");
		User user2 = new User(2,"Tommy","Vercetti" , "TommyViceCity@gmail.com","269874");
		User user3 = new User();
		
		UserManager userManager1 = new UserManager(new HibernateUserDao(), new AuthorityManager(new EmailManager()));
		userManager1.register(user1);
		userManager1.login(user1.geteMail(), user1.getPassword());
		
		userManager1.register(user2);
		userManager1.login(user1.geteMail(), user1.getPassword());
		
		UserManager userManager2 = new UserManager(new HibernateUserDao(), new AuthorityManager(new GoogleAuthManagerAdapter(), new EmailManager()));
		userManager2.register(user3);
		userManager2.login(user3.geteMail(), user3.getPassword());

	}

}
