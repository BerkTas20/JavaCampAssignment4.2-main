package Concrete;

import Entities.Campaign;

public class CampaignManager {

	
	public void Add(Campaign campaign) {
		System.out.println("Campaign Added: " + campaign.getCampaignName());
	}
	
	public void Delete(Campaign campaign) {
		System.out.println("Campaign Deleted: " + campaign.getCampaignName());
	}
	
	public void Updated(Campaign campaign) {
		System.out.println("Campaign Updated: " + campaign.getCampaignName());
	}
}
