package java_20160812_extends;

public class Main {
	
	public static void main(String[] args){
		
		SuperClass superClass = new SuperClass();
		superClass.superMethod1();
		superClass.superMethod2();
		
		SubClass subClass = new SubClass();
		subClass.superMethod1();
		subClass.superMethod2();
			
	}
	
}
