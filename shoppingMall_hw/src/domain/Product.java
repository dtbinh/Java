package domain;

public class Product {
	
	// variable
	private int number;		// 상품번호		
	private String name;	// 상품이름		 
	private int price;		// 상품가격		 
	private String information;  // 상품정보	
	
	
	// constructor
	public Product(String name, int price, String information) {	
		this.name = name;
		this.price = price;
		this.information = information;
	}
	
	
	// method
	
	// 상품번호
	public int getNumber() {				
		return number;
	}
	
	public void setNumber(int itemNumber) {		
		this.number = itemNumber;
	}
	
	// 상품이름 
	public String getName() {						
		return name;
	}
	
	public void setName(String itemName) {
		this.name = itemName;
	}
	
	// 상품가격
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int itemPrice) {
		this.price = itemPrice;
	}
	
	// 상품정보
	public String getInformation() {
		return information;
	}
	
	public void setInformation(String itemInformation) {
		this.information = itemInformation;
	}	

}