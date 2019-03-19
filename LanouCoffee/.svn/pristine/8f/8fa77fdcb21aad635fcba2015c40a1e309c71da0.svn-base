package com.lanou.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanou.dao.OrderDao;
import com.lanou.model.Order;

@Service
public class OrderService {
	@Autowired
	private OrderDao ordDao;

	public void addOrder(Order ord) {
		ordDao.addOrder(ord);

	};

	public Order queryId(Integer ordId) {
		return ordDao.queryOrderById(ordId);
	};

	public List<Order> queryAll() {
		return ordDao.queryAll();
	};

	public List<Order> queryStatus(Integer status) {
		return ordDao.queryOrderByStatus(status);
	};

}
