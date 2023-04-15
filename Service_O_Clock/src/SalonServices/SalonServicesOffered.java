/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SalonServices;

/**
 *
 * @author hi
 */
public class SalonServicesOffered {
    private String serviceName;
    private String serviceType;
    private String serviceDescription;

    public SalonServicesOffered(String serviceName, String serviceType, String serviceDescription) {
        this.serviceName = serviceName;
        this.serviceType = serviceDescription;
        this.serviceDescription = serviceType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }
    
    @Override
    public String toString() {
        return serviceName;
    }
}
