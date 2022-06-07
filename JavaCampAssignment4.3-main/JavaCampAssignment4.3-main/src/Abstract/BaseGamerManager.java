package Abstract;

import Entities.Gamer;

public class BaseGamerManager {
	public void Add(Gamer gamer) {
		System.out.println("Added to: " + gamer.getName());
	}
	public void Delete(Gamer gamer) {
		System.out.println("Deleted to: " + gamer.getName());
	}
	public void Update(Gamer gamer) {
		System.out.println("Updated to: " + gamer.getName());
	}
}
