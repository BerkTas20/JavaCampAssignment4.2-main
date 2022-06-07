package Entities;

public class Campaign {
	
	private int CampaignID;
	private String CampaignName;
	private String CampaignDetails;
	
	public Campaign() {
		
	}
	
	
	public Campaign(int campaignID, String campaignName, String campaignDetails) {
		super();
		CampaignID = campaignID;
		CampaignName = campaignName;
		CampaignDetails = campaignDetails;
	}
	public int getCampaignID() {
		return CampaignID;
	}
	public void setCampaignID(int campaignID) {
		CampaignID = campaignID;
	}
	public String getCampaignName() {
		return CampaignName;
	}
	public void setCampaignName(String campaignName) {
		CampaignName = campaignName;
	}
	public String getCampaignDetails() {
		return CampaignDetails;
	}
	public void setCampaignDetails(String campaignDetails) {
		CampaignDetails = campaignDetails;
	}
}
