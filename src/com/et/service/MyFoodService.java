package com.et.service;

import java.util.List;
import java.util.Map;

public interface MyFoodService {

	public abstract List<Map<String, Object>> queryFood(String foodname);

	public abstract void deleteFood(String foodid);

	public abstract void addFood(String foodname, String price);

	public abstract void updateFood(String foodid, String foodname, String price);

}