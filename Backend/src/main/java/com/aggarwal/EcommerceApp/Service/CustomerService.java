package com.aggarwal.EcommerceApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aggarwal.EcommerceApp.Repository.CustomerDetailRepository;
import com.aggarwal.EcommerceApp.entity.CustomerDetail;

@Service
public class CustomerService implements ICustomerService {

	@Autowired
	CustomerDetailRepository custRepo;

	@Override
	public List<CustomerDetail> getAllcustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addCustomer(CustomerDetail customer) {
		// TODO Auto-generated method stub
		custRepo.save(customer);
	}

	@Override
	public void deleteCustomer(int custId) {
		// TODO Auto-generated method stub

	}

	@Override
	public CustomerDetail getCustomer(int custId) {
		return custRepo.findById(custId).get();

	}

}
