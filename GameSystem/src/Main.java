import java.rmi.RemoteException;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import adapter.MernisServiceAdapter;
import concrete.CampaignManager;
import concrete.GameSellManager;
import concrete.GamerManager;

public class Main {

	public static void main(String[] args) throws RemoteException {
		Gamer gamer1 = new Gamer();
		gamer1.setGamerId(1);
		gamer1.setGamerFirstName("inan");
		gamer1.setGamerLastName(".....");
		gamer1.setDateOfBirth(1994);
		gamer1.setNationalityId(1111111111L);

		Game game1 = new Game();
		game1.setGameId(1);
		game1.setGameName("tetris");
		game1.setGamePrice(100);

		Campaign campaign1 = new Campaign();
		campaign1.setCampaignId(1);
		campaign1.setCampaingName("indirim");
		campaign1.setRateOfDiscount(50);
		campaign1.setGameHere(true);

		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.add(gamer1);

		CampaignManager campainManagger = new CampaignManager(campaign1);
		campainManagger.add(campaign1);

		GameSellManager gameSellManager = new GameSellManager(new CampaignManager(campaign1));
		gameSellManager.sell(gamer1, game1, campaign1);


	}

}
