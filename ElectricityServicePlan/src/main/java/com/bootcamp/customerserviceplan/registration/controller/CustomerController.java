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
import com.bootcamp.customerserviceplan.registration.service.soapclient.ServicePlan;

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

	// Displaying Form
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String displayForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "customer";
	}

	@RequestMapping(value = "/customer/add", method = RequestMethod.POST)
	public String addCustomer(ModelMap model, @ModelAttribute("customer") Customer customer) {

		if (customer != null) {

			int customerId = customerService.addCustomer(customer);
			customerService.sendMessage(customer);

			customer = customerService.getCustomerDetails(customerId);

			if (customer != null) {

				model.put("customer", customer);

			} else {
				
				return "error";
			}
		}

		return "customer";

	}
}