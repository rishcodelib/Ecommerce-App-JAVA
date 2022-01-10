package com.aggarwal.EcommerceApp.controllers;

import java.util.List;

import org.hibernate.engine.jdbc.spi.SqlExceptionHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.aggarwal.EcommerceApp.Service.ICustomerService;
import com.aggarwal.EcommerceApp.entity.CustomerDetail;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	ICustomerService cust;

	@GetMapping("")
	public List<CustomerDetail> getAllCustomers() {
		return cust.getAllcustomers();
	}

	@GetMapping("/{id}")
	public CustomerDetail getCustomer(@RequestParam("customerid") int custId) {
		return cust.getCustomer(custId);

	}

	@PostMapping
	public String addCustomer(@RequestBody CustomerDetail customer) {
		try {
			cust.addCustomer(customer);
			return "Customer Added " + customer.getCustomerID();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//			return e.getCause().getLocalizedMessage();
		}
		return "failed";
	}

}
