package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService  {
	public void Add(Game game) {
		System.out.println("Game Added: " + game.getGameName());
	}
	
	public void Delete(Game game) {
		System.out.println("Game Deleted: " + game.getGameName());
	}
	
	public void Update(Game game) {
		System.out.println("Game Updated: " + game.getGameName());
	}
}
