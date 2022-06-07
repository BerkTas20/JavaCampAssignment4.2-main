import Abstract.BaseGamerManager;
import Concrete.CampaignManager;
import Concrete.DatabaseLoggerService;
import Concrete.GamerControlManager;
import Concrete.GamerManager;
import Concrete.SalesManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		BaseGamerManager customerGamer = new BaseGamerManager();
		
		Gamer gamer1 = new Gamer();
		gamer1.setName("Alfred Brunson ");
		
		Game game = new Game(1,"Valheim" , 50);
		
		
		Campaign campaign = new Campaign(1,"CoffeeStainStudios are on sale in turkey","%50 Discount ! ");
		
		SalesManager salesManager = new SalesManager(campaign);
		salesManager.Sell(game, gamer1);
		
		GamerControlManager controlManager = new GamerControlManager();
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.Add(campaign);
		
		DatabaseLoggerService databaseLoggerService = new DatabaseLoggerService();
		databaseLoggerService.Log(databaseLoggerService);
		
	}

}
