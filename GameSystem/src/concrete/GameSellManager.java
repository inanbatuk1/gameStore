package concrete;

import Abstract.GameSellService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class GameSellManager implements GameSellService{
	
	private CampaignManager campaignManager;
	
	public GameSellManager(CampaignManager campaignManager) {
		
		this.campaignManager = campaignManager;
	}

	@Override
	public void sell(Gamer gamer, Game game, Campaign campaign) {
		
		if(campaign.isGameHere()) {
			System.out.println(gamer.getGamerFirstName()+" "+game.getGameName()+" Oyununu satýn aldý"+
					" "+campaign.getCampaingName()+" "+"kampanyasýndan yararlandý.");
			System.out.println("Oyunun kampanyadan sonraki fiyatý : "+campaign.getDiscountOfUnitPrice());
		}else
		{
			
			System.out.println(gamer.getGamerFirstName() + ", " + game.getGameName() + 
					" " + "oyununu satin aldý.");
			System.out.println("oyunun fiyati : "+game.getGamePrice());
		}
		
	}

	

}
