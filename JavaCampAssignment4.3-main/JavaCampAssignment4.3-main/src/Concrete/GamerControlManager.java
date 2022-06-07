package Concrete;

import Abstract.GamerControlService;
import Entities.Gamer;

public class GamerControlManager implements GamerControlService {

	public boolean checkIfRealGamer(Gamer gamer) {
		return true;
		
	}
}
