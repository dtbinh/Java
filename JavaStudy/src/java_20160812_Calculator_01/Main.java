package java_20160812_Calculator_01;

public class Main {

	public static void main(String[] args) {
	
		Plus p = new Plus();
		System.out.println(p.plus(10, 20));
		System.out.println(p.plus(1000, 20000));
		System.out.println(p.plus(-10, 0));
		System.out.println(p.plus(57.8, 10));
		System.out.println(p.plus(1000, -10.54));
		
		
	}

}
