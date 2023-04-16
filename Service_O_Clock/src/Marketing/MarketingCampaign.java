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
public class MarketingCampaign {
    
    private String userName;
    int id = 1;
    private ArrayList<CampaignPerformance> campaignPerformancesList;
//    private ArrayList<Feedback> feedbackList;
    private String campaignName;
    private String campaignType;
    private String campaignPhNum;
    private String campaignEmail;
    
    public MarketingCampaign(String name) {
        this.userName = name;
        campaignPerformancesList = new ArrayList<>();
//        feedbackList = new ArrayList<>();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<CampaignPerformance> getCampaignPerformancesList() {
        return campaignPerformancesList;
    }

    public void setCampaignPerformancesList(ArrayList<CampaignPerformance> campaignPerformancesList) {
        this.campaignPerformancesList = campaignPerformancesList;
    }

//    public ArrayList<Feedback> getFeedbackList() {
//        return feedbackList;
//    }
//
//    public void setFeedbackList(ArrayList<Feedback> feedbackList) {
//        this.feedbackList = feedbackList;
//    }

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

    public String getCampaignPhNum() {
        return campaignPhNum;
    }

    public void setCampaignPhNum(String campaignPhNum) {
        this.campaignPhNum = campaignPhNum;
    }

    public String getCampaignEmail() {
        return campaignEmail;
    }

    public void setCampaignEmail(String campaignEmail) {
        this.campaignEmail = campaignEmail;
    }
    
    public void addCampaignPerformancesList(CampaignPerformance campaignP){
        campaignPerformancesList.add(campaignP);
    }
    
    public void removeCampaignPerformancesList(CampaignPerformance campaignP){
        campaignPerformancesList.remove(campaignP);
    }
    
    
//    public void newFundDonation(String campaignName, String custName, ArrayList<CampaignPerformance> revenue, String phNum, int total) {
//        Feedback feedback = new Feedback();
//        feedback.setDonationId(String.valueOf(id));
//        feedback.setMemName(custName);
//        feedback.setMarketingOrgName(campaignName);
//        feedback.setDonation(revenue);
//        feedback.setMemberPhNum(phNum);
//        feedback.setTotalDonation(total);
//        feedbackList.add(feedback);
//        id++;
//    }
    
    @Override
    public String toString() {
        return campaignName;
    }
    
    
    
}
