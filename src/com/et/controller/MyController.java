package com.et.controller;

import java.io.OutputStream;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.et.service.MyFoodService;




@Controller
public class MyController{
	@Autowired 
	MyFoodService MyFoodService;

	
	@ResponseBody
	@RequestMapping(value="/showFoodList",method={RequestMethod.GET})
	public List<Map<String, Object>> queryFood3(String foodname) throws Exception{
		if(foodname==null){
			foodname="";
		}
		List<Map<String, Object>> list =MyFoodService.queryFood(foodname);
		return list;
	}
	
	@RequestMapping(value="/deleteFood/{foodid}",method={RequestMethod.DELETE})
	public String deleteFood(@PathVariable String foodid,OutputStream os) throws Exception {
		try {
			System.out.println(foodid);
			MyFoodService.deleteFood(foodid);
			os.write("1".getBytes("UTF-8"));
		} catch (Exception e) {
			e.printStackTrace();
			os.write("0".getBytes("UTF-8"));
		}
		return null;
	}
	
	@RequestMapping(value="/saveFood",method={RequestMethod.POST})
	public String saveFood(String foodname,String price,OutputStream os) throws Exception {
		

		try {
			MyFoodService.addFood(foodname, price);
			os.write("1".getBytes("UTF-8"));
		} catch (Exception e) {
			e.printStackTrace();
			os.write("0".getBytes("UTF-8"));
		}
		
		return null;
	}
	
	@RequestMapping(value="/updateFood/{foodid}",method={RequestMethod.PUT})
	public String updateFood(@PathVariable String foodid,String foodname,String price,OutputStream os) throws Exception{
		try {
			System.out.println(foodid);
			MyFoodService.updateFood(foodid, foodname, price);
			os.write("1".getBytes("UTF-8"));
		} catch (Exception e) {
			e.printStackTrace();
			os.write("0".getBytes("UTF-8"));
		}
		return null;
	}
}
