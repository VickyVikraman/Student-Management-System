package com.foodmanagement.food.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.foodmanagement.food.foodDao.FoodDao;
import com.foodmanagement.food.mapper.FoodMapper;
import com.foodmanagement.food.model.Food;
import com.foodmanagement.food.model.FoodEntity;

@Component
public class FoodServiceImpl 
{
	@Autowired
	FoodDao foodDao;
	
	@Autowired
	FoodMapper foodMapper;
	
	public Food addFood(Food food) 
	{
		FoodEntity foodEntity = foodMapper.mapFoodDetails(food);
		foodDao.save(foodEntity);
		return null;
	}
	
}
