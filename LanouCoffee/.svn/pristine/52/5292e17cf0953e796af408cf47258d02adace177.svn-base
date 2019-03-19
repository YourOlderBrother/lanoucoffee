package com.lanou.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanou.dao.OrderDetailsDao;
import com.lanou.model.OrderDetails;

@Service
public class OrderDetailsService {
	@Autowired
	private OrderDetailsDao detDao;

	public void addDetails(OrderDetails det) {
		detDao.addDetails(det);
	};

	public void updateDetails(OrderDetails det) {
		detDao.updateDetails(det);
	};

	public OrderDetails queryDetails(Integer detId) {
		return detDao.queryDetails(detId);
	};

	public List<OrderDetails> queryAll() {
		return detDao.queryAll();
	};

}
