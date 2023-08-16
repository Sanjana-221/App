package com.foodapp.client;

import java.util.Scanner;

import com.foodapp.exception.FoodNotFoundException;
import com.foodapp.model.Food;
import com.foodapp.service.FoodServiceImpl;
import com.foodapp.service.IFoodService;

public class FoodMain {
	

	public static void main(String[]args, FoodServiceImpl FoodService, Object FoodName, Object Reviews) throws FoodNotFoundException {
		Scanner scanner= new Scanner(System.in);
		IFoodService foodService = new FoodServiceImpl();
		System.out.println("Welcome to HappyTummy! Satisfy Your Cravings");
		System.out.println(
				"1. Select Your CuisineType\n 2.Choose Your FoodName \n 3.Select your favourite Dish\n 4.Check Price\n 5.See the Reviews\n 6.Order And Satisfy Your tastebuds\n ");
		int choice = scanner.nextInt();
		switch(choice) {
		case 1:{
			scanner.nextLine();
			System.out.println("Enter CuisineType: ");
			String CuisineType = scanner.nextLine();
			System.out.println("Enter FoodName: ");
			String FoodName1 = scanner.nextLine();
			System.out.println("Enter Reviews: ");
			String Reviews1 = scanner.nextLine();
			System.out.println("Enter price : ");
			double price= scanner.nextInt();
			System.out.println("Enter Order: ");
			int Order = scanner.nextInt();
			Food food= new Food(CuisineType, FoodName1, Reviews1, price, Order);
			foodService.addFood(food);
			break;
		}
			
		
		case 2:{
			System.out.println("Enter FoodName: ");
			 String FoodName1= scanner.nextLine();
			FoodService.deleteFood();
			break;
		}
		case 3:{
			System.out.println("Enter Reviews: ");
			String Reviews1 = scanner.nextLine();
			foodService.findByFoodNameandReviews(Reviews1,Reviews1);
			break;
		}
		case 4:{
			foodService.findAllFood();
			break;
			
		}
		case 5:{
			scanner.nextLine();
			System.out.println("Enter price:");
			Integer price = scanner.nextInt();
			foodService.getById(price);
			break;
		}
		case 6:{
			scanner.nextLine();
			System.out.println("Enter Order: ");
			int Order = scanner.nextInt();
			System.out.println("Enter Number of Orders");
			int Order1 = scanner.nextInt();
			foodService.findByFoodNameandReviews(FoodName,Reviews);
			break;
			
		}
		case 7:{
			scanner.nextLine();
			System.out.println("CuisineType: ");
			String cuisineType = scanner.nextLine();
			System.out.println("Enter CuisineType: ");
			String CuisineType = scanner.nextLine();
			 foodService.getByCuisineTypeAndFoodName(CuisineType,FoodName);
			break;
		}


	}

}
		}
	


