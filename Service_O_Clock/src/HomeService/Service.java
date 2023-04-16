/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HomeService;

/**
 *
 * @author 91730
 */
public class Service {
    
    private String serviceName;
    private String serviceType;
    private String serviceDescription;

    public Service(String ServiceItemName, String ServiceItemDescription, String ServiceItemType) {
        this.serviceName = ServiceItemName;
        this.serviceType = ServiceItemType;
        this.serviceDescription = ServiceItemDescription;
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
