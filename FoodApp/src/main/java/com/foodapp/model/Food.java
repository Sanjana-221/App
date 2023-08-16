package com.foodapp.model;

public class Food {
	private String CuisineType;
	private String FoodName;
	private String Reviews;
	private double price;
	private int  Order  ;
	
	public Food() {
		super();
	}
	
	public Food(String CuisineType, String FoodName, String Reviews, double price,int Order) {
		super();
		this.CuisineType = CuisineType;
		this.FoodName = FoodName;
		this.Reviews = Reviews;
		this.price = price;
		this.Order = Order;
	}

	public String CuisineType() {
		return CuisineType;
	}

	public void setCuisineType(String CuisineType) {
		this.CuisineType = CuisineType;
	}

	public String getFoodName() {
		return FoodName;
	}
	public void setFoodName(String FoodName) {
		this.FoodName = FoodName;
	}
	public String getReviews() {
		return Reviews;
	}
	public void setReviews(String Reviews) {
		this.Reviews = Reviews;
	}
	public double getPrice() {
		return price;
	}
	public void setprice(double price) {
		this.price =price;
	}

	public int getOrder() {
		return getOrder();
	}
	public void setOrder(int Order) {
		this.Order = Order;
	}

	@Override
	public String toString() {
		return "Food [CuisinieType=" + CuisineType + ", FoodName=" + FoodName + ", Reviews=" + Reviews + ",price =" 
				+ price + ", Order=" + Order + "]";
	}

	public static String updateFood(String cuisineType2) {
		return null;
	}
	
	
}


