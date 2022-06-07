package javaCampAssignment5.core.concretes;

import javaCampAssignment5.core.abstracts.EmailService;

public class EmailManager implements EmailService{

	@Override
	public void sendVerificationMail(String eMail) {
		System.out.println("Verification mail has send to " + eMail);
		System.out.println("E-mail >> Please Verify your e-mail by clicking on this link: https://emailverificationlink.com/");	}
	
}
