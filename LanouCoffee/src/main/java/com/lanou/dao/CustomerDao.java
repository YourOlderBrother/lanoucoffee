package com.lanou.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.lanou.model.Customer;

@Mapper
public interface CustomerDao {
	public abstract Integer addCustomer(Customer cus);
	//更新
	public abstract Integer updateCustomer(Customer cus);

	public abstract Customer queryCustomer(Integer cusAccount);
	//查
	public abstract List<Customer> queryAll();

}
