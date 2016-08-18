package com.bootcamp.customerserviceplan.registration.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bootcamp.customerserviceplan.registration.model.Customer;
import com.bootcamp.customerserviceplan.registration.service.CustomerService;
import com.bootcamp.customerserviceplan.registration.service.RestfulServiceClient;
import com.bootcamp.customerserviceplan.registration.service.SOAPServiceClient;

/**
 * This class get the customer information from the web page
 * 
 * @author Jude Mariarajan
 *
 */
@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String displayForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "customer";
	}

	@RequestMapping(value = "/customer/add", method = RequestMethod.POST)
	public String addCustomer(ModelMap model, @ModelAttribute("customer") Customer customer) throws IOException {

		if (customer != null) {

			customerService.addCustomer(customer);
			customerService.sendMessage(customer);
			
			int serviceId = SOAPServiceClient.getServicePlan().get(2).getServiceId();
			String servicePlan = SOAPServiceClient.getServicePlan().get(2).getServicePlan();
			String serviceCharge = SOAPServiceClient.getServicePlan().get(2).getServiceCharge();
			String servicePeriod = SOAPServiceClient.getServicePlan().get(2).getServicePeriod();

			model.put("customer", customer);

			model.addAttribute("serviceId", serviceId);
			model.addAttribute("servicePlan", servicePlan);
			model.addAttribute("serviceCharge", serviceCharge);
			model.addAttribute("servicePeriod", servicePeriod);
		}

		return "customer";

	}
}