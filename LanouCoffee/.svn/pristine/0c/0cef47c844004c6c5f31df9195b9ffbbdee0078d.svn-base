package com.lanou.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.lanou.model.Order;

@Mapper
public interface OrderDao {
	public abstract Integer addOrder(Order ord);

	public abstract Order queryOrderById(Integer ordId);

	public abstract List<Order> queryAll();

	public abstract List<Order> queryOrderByStatus(Integer status);
}
