package com.foodapp.util;

public class Queries {

	public static final String CREATEQUERY=
	"Create table Food(CuisineType primary key, FoodName varchar(30),Reviews varchar(20),price, Order)";
	public static final String INSERTQUERY =
			"insert into Food(CuisineType, FoodName,Reviews,price, Order) values(?,?,?,?,?)";
	
	public static final String UPDATEQUERY=
			"update animals set Reviews=? where CuisineType=?";
	
	public static final String DELETEQUERY=
			"delete from Food where CuisineType=?";
	
	public static final String GETALLQUERY=
			"select * from Food";
	
	public static final String QUERYBYCUISINETYPE=
			"select * from Food where CuisineType=?";
	
	public static final String QUERYBYREVIEWSANDPRICE =
			"select * from Food where Reviews=? and price=?";
	
	public static final String QUERYBYREVIEWSANDORDER = 
			"select * from Food where Reviews=? and Order = ?";
	public static final String QUERYBYFOODNAMEANDREVIEWS = null;
	public static final String QUERYBYREVIEWSANDORDERS = null;

}


