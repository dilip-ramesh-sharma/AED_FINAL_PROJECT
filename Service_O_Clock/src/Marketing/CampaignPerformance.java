/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Marketing;

/**
 *
 * @author 91730
 */
public class CampaignPerformance {
    
    private String campaignName;
    private String campaignType;
    private String campaignDescription;
    private int campaignBudget;
    private int campaignCost = 0;
    private int costPerCampaign = 0;
    private Boolean campaignActive = true;
    private String campaignStatus = "Active";
    private int totalRevenue = 0;
   
    public CampaignPerformance(String campaignName, String campaignDescription, String campaignType, int campaignBudget) {
        this.campaignName = campaignName;
        this.campaignType = campaignType;
        this.campaignDescription = campaignDescription;
        this.campaignBudget = campaignBudget;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public String getCampaignType() {
        return campaignType;
    }

    public void setCampaignType(String campaignType) {
        this.campaignType = campaignType;
    }

    public String getCampaignDescription() {
        return campaignDescription;
    }

    public void setCampaignDescription(String campaignDescription) {
        this.campaignDescription = campaignDescription;
    }

    public int getCampaignBudget() {
        return campaignBudget;
    }

    public void setCampaignBudget(int campaignBudget) {
        this.campaignBudget = campaignBudget;
    }

    public int getCampaignCost() {
        return campaignCost;
    }

    public void setCampaignCost(int campaignCost) {
        this.campaignCost = campaignCost;
    }

    public int getCostPerCampaign() {
        return costPerCampaign;
    }

    public Boolean getCampaignActive() {
        return campaignActive;
    }

    public void setCampaignActive(Boolean campaignActive) {
        this.campaignActive = campaignActive;
    }

    public String getCampaignStatus() {
        return campaignStatus;
    }

    public void setCampaignStatus(String campaignStatus) {
        this.campaignStatus = campaignStatus;
    }

    public int getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(int totalRevenue) {
        this.totalRevenue = totalRevenue;
    }
    
    public void setCostPerCampaign(int campaignCost) {
        this.costPerCampaign = costPerCampaign + campaignCost;
        if(costPerCampaign>=campaignBudget){
            setCampaignActive(false);
            setCampaignStatus("Closed");
        }
    }

    @Override
    public String toString() {
        return campaignName;
    }
    
}
