package com.lanou.model;

import java.util.List;

public class Order {
	private Integer ordId;// 订单编号
	private Integer cusId;// 客户ID
	private Integer admId;// 管理员ID
	private String Name;// 客户姓名
	private Integer Account;// 客户电话(客户账号)
	private String Address;// 客户地址
	private String Date;// 订单日期
	private String Status;//订单状态
	private List<Coffee> goods;

	public Order() {
		super();
	}

	public Order(Integer cusId, Integer admId, String name, Integer account, String address, String date, String status,
			List<Coffee> goods) {
		super();
		this.cusId = cusId;
		this.admId = admId;
		Name = name;
		Account = account;
		Address = address;
		Date = date;
		Status = status;
		this.goods = goods;
	}

	public Integer getOrdId() {
		return ordId;
	}

	public void setOrdId(Integer ordId) {
		this.ordId = ordId;
	}

	public Integer getCusId() {
		return cusId;
	}

	public void setCusId(Integer cusId) {
		this.cusId = cusId;
	}

	public Integer getAdmId() {
		return admId;
	}

	public void setAdmId(Integer admId) {
		this.admId = admId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Integer getAccount() {
		return Account;
	}

	public void setAccount(Integer account) {
		Account = account;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public List<Coffee> getGoods() {
		return goods;
	}

	public void setGoods(List<Coffee> goods) {
		this.goods = goods;
	}
	
	

}
