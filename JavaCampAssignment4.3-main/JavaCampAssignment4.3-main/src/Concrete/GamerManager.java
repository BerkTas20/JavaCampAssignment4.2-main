package Concrete;

import Abstract.GamerControlService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService {
	
	
	public void Add(Gamer gamer) {
		System.out.println("Gamer " + gamer.getName() + "Added." );
	}
	
	public void Delete(Gamer gamer) {
		System.out.println("Gamer " + gamer.getSurname() + "Deleted." );
	}
	
	public void Update(Gamer gamer) {
		System.out.println("Gamer Updated !" );
	}
	
	
	
}
