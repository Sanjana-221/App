package com.foodapp.service;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.foodapp.Dao.FoodDaoImpl;
import com.foodapp.Dao.IFoodDao;
import com.foodapp.exception.FoodNotFoundException;
import com.foodapp.model.Food;

public abstract class FoodServiceImpl implements IFoodService {
	IFoodDao foodDao = new FoodDaoImpl();

	@Override
	public void addFood(Food Food) {
		foodDao.addFood(Food);
	    return;
		
	}

	@Override
	public String updateFood(String CuisineType, double price, int Order, String Reviews) {
String result = foodDao.updateFood(CuisineType, Reviews);		
return result ;
	}

	@Override
	public List<Food>getAllFood() {
		List<Food> foods = foodDao.findAllFood();
		
		return Food.getAllFood((null));
	}

	@Override
	public void deleteFood() {
		foodDao.deleteFood(0);;
		
	}

	@Override
	public List<Food> getByCuisineTypeAndFoodName(String cuisineType, Object foodName) {
		List<Food> foods = foodDao.findCuisineTypeANDFOODNAME(cuisineType);
		return (List<Food>) foods.stream();
		
	}

	@Override
	public List<Food> getByFoodNameandReviews(String FoodName, String Reviews) {
		List<Food> foods = foodDao.findByFoodNameandReviews(FoodName, Reviews);
		return (List<Food>) foods.stream();
	}

	
	

}
