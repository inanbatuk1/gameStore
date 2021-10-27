package concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{
	
	private Campaign campaign ;

	public CampaignManager(Campaign campaign1) {
		
	}

	@Override
	public void add(Campaign campaign) {
		System.out.println("Yeni kampanya eklendi : "+campaign.getCampaingName());
		
	}

	@Override
	public void remove(Campaign campaign) {
		System.out.println("Kampanya sistemden kaldýrýldý : "+campaign.getCampaingName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya Güncellendi : "+campaign.getCampaingName());
		
	}

}
