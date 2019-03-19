package com.lanou.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.lanou.model.Coffee;

@Mapper
public interface CoffeeDao {
	public abstract Integer addCoffee(Coffee cof);

	public abstract Integer deleteCoffee(String cofName);

	public abstract Integer updateCoffee(Coffee cof);

	public abstract Coffee queryCoffee(String cofName);

	public abstract List<Coffee> queryAll();

}
