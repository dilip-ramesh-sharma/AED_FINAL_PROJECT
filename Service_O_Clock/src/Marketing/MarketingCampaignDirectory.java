/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Marketing;

import java.util.ArrayList;

/**
 *
 * @author 91730
 */
public class MarketingCampaignDirectory {
    
    private ArrayList<MarketingCampaign> marketingCampaignList;
    private MarketingCampaign marketingCampaign;
    private CampaignPerformance campPer;
    
    public MarketingCampaignDirectory(){
        this.marketingCampaignList = new ArrayList<>();
    }

    public ArrayList<MarketingCampaign> getMarketingCampaignList() {
        return marketingCampaignList;
    }

    public void setMarketingCampaignList(ArrayList<MarketingCampaign> marketingCampaignList) {
        this.marketingCampaignList = marketingCampaignList;
    }
    
    public MarketingCampaign createFundRaisingInfo(String campaignName){
        marketingCampaign = new MarketingCampaign(campaignName);
        marketingCampaignList.add(marketingCampaign);
        return marketingCampaign;
    }
    
    public void deleteCampaign(String username){
        for(int i=0;i<marketingCampaignList.size();i++){
            if(marketingCampaignList.get(i).getUserName().equals(username)){
                marketingCampaignList.remove(i);
            }
        }
    }
    
    public void updateMarketCampaignInfo(MarketingCampaign marketingCampaign, String name, String number, String type, String email){
        marketingCampaign.setCampaignName(name);
        marketingCampaign.setCampaignType(type);
        marketingCampaign.setCampaignPhNum(number);
        marketingCampaign.setCampaignEmail(email);
    }
   
    public CampaignPerformance addFundsTypes(MarketingCampaign marCampaign, String name, String desc, String type, int amount){
        campPer = new CampaignPerformance(name, desc, type, amount);
        marCampaign.addCampaignPerformancesList(campPer);
        return campPer;
    }
    
    public void DeleteServices(MarketingCampaign marketingCampaign, CampaignPerformance campPer){
        marketingCampaign.removeCampaignPerformancesList(campPer); 
    }
    
    
}
