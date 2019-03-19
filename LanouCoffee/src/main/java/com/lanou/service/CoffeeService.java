package com.lanou.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanou.dao.CoffeeDao;
import com.lanou.model.Coffee;

@Service
public class CoffeeService {
	@Autowired
	private CoffeeDao cofDao;

	public void addCoffee(Coffee cof) {
		cofDao.addCoffee(cof);
	};

	public void deleteCoffee(String cofName) {
		cofDao.deleteCoffee(cofName);
	};

	public void updateCoffee(Coffee cof) {
		cofDao.updateCoffee(cof);
	};

	public Coffee queryCoffee(String cofName) {
		return cofDao.queryCoffee(cofName);
	};

	public List<Coffee> queryAll() {
		return cofDao.queryAll();
	};

}
