package com.lanou.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanou.dao.CustomerDao;
import com.lanou.exception.NameException;
import com.lanou.exception.UserNotExistException;
import com.lanou.model.Customer;

@Service
public class CustomerService {
	@Autowired
	private CustomerDao cusDao;

	public CustomerDao getCusDao() {
		return cusDao;
	}

	public void setCusDao(CustomerDao cusDao) {
		this.cusDao = cusDao;
	}

	public void addCustomer(Customer cus) {
		cusDao.addCustomer(cus);
	};

	public void updateCustomer(Customer cus) {
		cusDao.updateCustomer(cus);
	};

	public Customer queryCustomer(Integer cusAccount) {
		return cusDao.queryCustomer(cusAccount);
	};

	// 查
	public List<Customer> queryAll() {
		return cusDao.queryAll();
	};

	public void login(Customer cus) throws UserNotExistException, NameException {
		Customer newCus = cusDao.queryCustomer(cus.getCusAccount());
		if (newCus == null) {
			throw new UserNotExistException();
		} else if (!newCus.getCusPassword().equals(cus.getCusPassword())) {
			throw new NameException();
		}
	}

}
