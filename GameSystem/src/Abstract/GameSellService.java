package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface GameSellService {
	
	void sell(Gamer gamer,Game game, Campaign campaign);
		
	
}
