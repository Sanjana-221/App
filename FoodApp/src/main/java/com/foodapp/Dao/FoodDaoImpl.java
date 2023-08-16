package com.foodapp.Dao;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.foodapp.Dao.FoodDaoImpl;
import com.foodapp.Dao.IFoodDao;
import com.foodapp.exception.FoodNotFoundException;
import com.foodapp.model.Food;
import com.foodapp.service.IFoodService;

public abstract class FoodDaoImpl implements IFoodService{
	FoodDaoImpl foodDao = new FoodDaoImpl();

	@Override
	public void addFood(Food Food) {
		foodDao.addFood(Food);
		
	}

	@Override
	public String updateFood(String CuisineType, double price, int Order, String Reviews) {
		String result = foodDao.updateFood(CuisineType, price, Order, Reviews);
				
		return null;
	}

	@Override
	public void deleteFood(int Order) {
		foodDao.deleteFood( Order);
	}

	@Override
	public Food findByFoodName(String FoodName) {
		return null;
	}

	@Override
	public List<Food> findAllFood() {
		List<Food> foods = foodDao.findAllFood();
		if(foods.isEmpty())throw new FoodNotFoundException("No such foodtype exists");
		return foods.stream();
	}

	@Override
	public List<Food> findCuisineType(String CuisineType) {
		return null;
	}

	@Override
	public List<Food> findBypriceandFoodName(double price, String FoodName) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public void getById(Integer Order) {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public void deleteFood() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getByTypeAndAge(String animalType, int age) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findByFoodNameandReviews(Object foodName, Object reviews) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getByCuisineTypeAndFoodName(String cuisineType, Object foodName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Food> findByFoodNameandReviews(String FoodName, String Reviews)
			throws com.foodapp.service.FoodNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
