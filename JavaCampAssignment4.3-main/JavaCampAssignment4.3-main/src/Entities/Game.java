package Entities;

public class Game {
	private int GameID;
	private String GameName;
	private double GamePrice;
	
	public Game(int gameID, String gameName, double gamePrice) {
		super();
		GameID = gameID;
		GameName = gameName;
		GamePrice = gamePrice;
		
		
	}
	public int getGameID() {
		return GameID;
	}
	public void setGameID(int gameID) {
		GameID = gameID;
	}
	public String getGameName() {
		return GameName;
	}
	public void setGameName(String gameName) {
		GameName = gameName;
	}
	public double getGamePrice() {
		return GamePrice;
	}
	public void setGamePrice(double gamePrice) {
		GamePrice = gamePrice;
	}
}
