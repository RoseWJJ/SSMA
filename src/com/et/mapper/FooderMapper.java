package com.et.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface FooderMapper {
	@Select("SELECT * FROM food WHERE foodname LIKE '%${foodname}%'")
	public  List<Map<String,Object>>  queryFood(@Param("foodname")String foodname);
	
	
	@Delete("delete  FROM food WHERE foodid = #{0}")
	public void deleteFood(String foodid);
	
	@Insert("INSERT INTO food (foodname, price) VALUES (#{0},#{1})")
	public void addFood(String foodname,String price);
	
	@Update("UPDATE food SET foodname = #{1} , price = #{2} WHERE foodid = #{0}")
	public void updateFood(String foodid,String foodname,String price);
}
