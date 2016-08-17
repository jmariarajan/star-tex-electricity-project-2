
package com.bootcamp.customerserviceplan.registration.service.soapclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bootcamp.customerserviceplan.registration.service.soapclient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetElectricityServicePlan_QNAME = new QName("http://soapws.service.electricityplan.utilityservice.bootcamp.com/", "getElectricityServicePlan");
    private final static QName _GetElectricityServicePlanResponse_QNAME = new QName("http://soapws.service.electricityplan.utilityservice.bootcamp.com/", "getElectricityServicePlanResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bootcamp.customerserviceplan.registration.service.soapclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetElectricityServicePlan }
     * 
     */
    public GetElectricityServicePlan createGetElectricityServicePlan() {
        return new GetElectricityServicePlan();
    }

    /**
     * Create an instance of {@link GetElectricityServicePlanResponse }
     * 
     */
    public GetElectricityServicePlanResponse createGetElectricityServicePlanResponse() {
        return new GetElectricityServicePlanResponse();
    }

    /**
     * Create an instance of {@link ServicePlan }
     * 
     */
    public ServicePlan createServicePlan() {
        return new ServicePlan();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetElectricityServicePlan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapws.service.electricityplan.utilityservice.bootcamp.com/", name = "getElectricityServicePlan")
    public JAXBElement<GetElectricityServicePlan> createGetElectricityServicePlan(GetElectricityServicePlan value) {
        return new JAXBElement<GetElectricityServicePlan>(_GetElectricityServicePlan_QNAME, GetElectricityServicePlan.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetElectricityServicePlanResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapws.service.electricityplan.utilityservice.bootcamp.com/", name = "getElectricityServicePlanResponse")
    public JAXBElement<GetElectricityServicePlanResponse> createGetElectricityServicePlanResponse(GetElectricityServicePlanResponse value) {
        return new JAXBElement<GetElectricityServicePlanResponse>(_GetElectricityServicePlanResponse_QNAME, GetElectricityServicePlanResponse.class, null, value);
    }

}
