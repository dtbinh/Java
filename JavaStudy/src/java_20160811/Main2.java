package java_20160811;

import java.util.Arrays;

public class Main2 {
	
	static Product[] products = new Product[3];
	
	public static void main(String[] args){
	
		Main2.products[0] = new Product("1", 1, "1");
		Main2.products[1] = new Product("2", 2, "2");
		Main2.products[2] = new Product("3", 3, "3");
		
		Main2.products[0].setNumber(1);
		Main2.products[1].setNumber(2);
		Main2.products[2].setNumber(3);
		
		System.out.println("번호\t이름\t가격\t정보");
		for(int i=0; i<Main2.products.length; i++){
			System.out.print(Main2.products[i].getNumber() + "\t");
			System.out.print(Main2.products[i].getName() + "\t");
			System.out.print(Main2.products[i].getPrice() + "\t");
			System.out.println(Main2.products[i].getInfo());
		}
		
		Product[] temp = Arrays.copyOfRange(Main2.products, 1, 3);
		Main2.products = temp;
		
		System.out.println("번호\t이름\t가격\t정보");
		for(int i=0; i<Main2.products.length; i++){
			if(Main2.products[i].getNumber() != -1){
				System.out.print(Main2.products[i].getNumber() + "\t");
				System.out.print(Main2.products[i].getName() + "\t");
				System.out.print(Main2.products[i].getPrice() + "\t");
				System.out.println(Main2.products[i].getInfo());
			}
		}
		
	}
	
}
