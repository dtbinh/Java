package shop;

import java.util.ArrayList;

import shop.Product;
import shop.User;

public class ShopRepository {
	
	// 상품 배열 리스트
	static ArrayList<Product> products = new ArrayList<Product>();
	// 상품 숫자 카운팅
	static int lastProductNumber = 0;
	
	// 유저 배열 리스트
	static ArrayList<User> users = new ArrayList<User>();
	// 유저 숫자 카운팅
	static int lastUserNumber = 0;
	// 로그인한 유저의 번호 저장
	static int loginUserNumber = 0;
	
	// 카트 배열 리스트
	static ArrayList<Product> carts = new ArrayList<Product>();
	
}