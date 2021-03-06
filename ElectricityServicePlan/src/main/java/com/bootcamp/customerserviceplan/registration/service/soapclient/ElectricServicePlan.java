package com.bootcamp.customerserviceplan.registration.service.soapclient;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2016-08-17T12:52:50.194-05:00
 * Generated source version: 3.1.7
 * 
 */
@WebServiceClient(name = "ElectricServicePlan", 
                  wsdlLocation = "file:/C:/BCJMay16/LocalGitHub/ElectricityServicePlan/src/main/resources/test.wsdl",
                  targetNamespace = "http://soapws.service.electricityplan.utilityservice.bootcamp.com/") 
public class ElectricServicePlan extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://soapws.service.electricityplan.utilityservice.bootcamp.com/", "ElectricServicePlan");
    public final static QName ElectricityServicePlanImplPort = new QName("http://soapws.service.electricityplan.utilityservice.bootcamp.com/", "ElectricityServicePlanImplPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/BCJMay16/LocalGitHub/ElectricityServicePlan/src/main/resources/test.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ElectricServicePlan.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/BCJMay16/LocalGitHub/ElectricityServicePlan/src/main/resources/test.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ElectricServicePlan(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ElectricServicePlan(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ElectricServicePlan() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public ElectricServicePlan(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ElectricServicePlan(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ElectricServicePlan(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns ElectricityServicePlan
     */
    @WebEndpoint(name = "ElectricityServicePlanImplPort")
    public ElectricityServicePlan getElectricityServicePlanImplPort() {
        return super.getPort(ElectricityServicePlanImplPort, ElectricityServicePlan.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ElectricityServicePlan
     */
    @WebEndpoint(name = "ElectricityServicePlanImplPort")
    public ElectricityServicePlan getElectricityServicePlanImplPort(WebServiceFeature... features) {
        return super.getPort(ElectricityServicePlanImplPort, ElectricityServicePlan.class, features);
    }

}
