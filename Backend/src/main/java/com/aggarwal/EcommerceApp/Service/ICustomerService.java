package com.aggarwal.EcommerceApp.Service;

import java.util.List;

import com.aggarwal.EcommerceApp.entity.CustomerDetail;

public interface ICustomerService {

	public List<CustomerDetail> getAllcustomers();

	public void addCustomer(CustomerDetail customer);

	public void deleteCustomer(int custId);

	public CustomerDetail getCustomer(int custId);

}
