package java_20160811;

public class Product {

	private int number;
	private String name;
	private int price;
	private String info;
	
	public Product(String name, int price, String info) {
		this.name = name;
		this.price = price;
		this.info = info;
	}

	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
}
