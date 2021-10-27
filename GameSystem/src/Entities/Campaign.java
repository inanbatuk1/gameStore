package Entities;

public class Campaign {
	

    Game game= new Game();
	
	private int campaignId ;
	private double discountOfUnitPrice;
	private String campaingName;
	private double rateOfDiscount;
	private boolean isGameHere;
	
	public Campaign() {
	}

	public Campaign(int campaignId, double discountOfUnitPrice, String campaingName, double rateOfDiscount,
			boolean isGameHere) {
		super();
		this.campaignId = campaignId;
		this.discountOfUnitPrice = discountOfUnitPrice;
		this.campaingName = campaingName;
		this.rateOfDiscount = rateOfDiscount;
		this.isGameHere = isGameHere;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public double getDiscountOfUnitPrice() {
		return discountOfUnitPrice;
	}

	public void setDiscountOfUnitPrice(double discountOfUnitPrice) {
		this.discountOfUnitPrice = discountOfUnitPrice;
	}

	public String getCampaingName() {
		return campaingName;
	}

	public void setCampaingName(String campaingName) {
		this.campaingName = campaingName;
	}

	public double getRateOfDiscount() {
		return rateOfDiscount;
	}

	public void setRateOfDiscount(double rateOfDiscount) {
		this.rateOfDiscount = rateOfDiscount;
	}

	public boolean isGameHere() {
		return isGameHere;
	}

	public void setGameHere(boolean isGameHere) {
		this.isGameHere = isGameHere;
	}



}
