package com.et.dao.impl;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.et.dao.MyFoodDao;
import com.et.mapper.FooderMapper;


@Repository
public class MyFoodDaoImpl implements MyFoodDao {
	@Autowired 
	FooderMapper fooderMapper;
	public  List<Map<String,Object>>  queryFood(String foodname) {
		return fooderMapper.queryFood(foodname);
		
	}
	public void deleteFood(String foodid) {
		fooderMapper.deleteFood(foodid);
		
	}
	public void addFood(String foodname,String price) {
		fooderMapper.addFood(foodname, price);
		
	}
	public void updateFood(String foodid,String foodname,String price) {
		fooderMapper.updateFood(foodid, foodname, price);		
		
	}
}
