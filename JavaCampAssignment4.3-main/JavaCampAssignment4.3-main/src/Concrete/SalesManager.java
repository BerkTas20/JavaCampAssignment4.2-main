package Concrete;

import Abstract.SalesService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SalesManager implements SalesService {
	
	private Campaign campaign;

	
	public SalesManager(Campaign campaign) {
		this.campaign = campaign;
	}
	
	public void Sell(Game game , Gamer gamer) {
		System.out.println("This Game ,  " + gamer.getName() + " " + gamer.getSurname() + " to the player named " + game.getGamePrice() + " Sold !");
	}
	
}
