package com.et.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.et.dao.MyFoodDao;
import com.et.service.MyFoodService;

@Repository
public class MyFoodServiceImpl implements  MyFoodService {
	@Autowired
	MyFoodDao foodDao;

	/* (non-Javadoc)
	 * @see com.et.service.impl.MyFoodService#queryFood(java.lang.String)
	 */
	public List<Map<String, Object>> queryFood(String foodnaem) {
		return foodDao.queryFood(foodnaem);

	}

	/* (non-Javadoc)
	 * @see com.et.service.impl.MyFoodService#deleteFood(java.lang.String)
	 */
	public void deleteFood(String foodid) {
		foodDao.deleteFood(foodid);

	}

	/* (non-Javadoc)
	 * @see com.et.service.impl.MyFoodService#addFood(java.lang.String, java.lang.String)
	 */
	public void addFood(String foodname, String price) {
		foodDao.addFood(foodname, price);

	}

	/* (non-Javadoc)
	 * @see com.et.service.impl.MyFoodService#updateFood(java.lang.String, java.lang.String, java.lang.String)
	 */
	public void updateFood(String foodid, String foodname, String price) {
		foodDao.updateFood(foodid, foodname, price);

	}
}
