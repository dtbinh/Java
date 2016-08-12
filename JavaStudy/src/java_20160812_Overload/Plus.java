package java_20160812_Overload;

public class Plus {

	// method Overload 
	// 1. parameter의 data type이 다르면 인정
	// 2. parameter의 갯수가 다르면 인정
	
	public double plus(double num1, double num2){
		
		return num1 + num2;
		
	}
	
	public double plus(double num1, double num2, double num3){
		
		return num1 + num2;
		
	}
	
	public double plus(int num1, double num2){
		
		return num1 + num2;
		
	}
	
	public double plus(double num1, int num2){
		
		return num1 + num2;
		
	}
	
	public double plus(int num1, int num2){
		
		return num1 + num2;
		
	}
	
	// parameter 변수명만 바꾼다고 인정되지 않는다.
	/*public double plus(int num111, int num222){
		
		return num111 + num222;
		
	}*/
	
	// 리턴 타입은 달라도 인정되지 않는다.
	/*public int plus(int num1, int num2){
		
		return num1 + num2;
		
	}*/
	
}
