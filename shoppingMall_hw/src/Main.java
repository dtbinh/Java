import process.ShopProcess;
import process.Start;

public class Main {

	public static void main(String[] args) {
		
		ShopProcess process = new ShopProcess();
		Start start = new Start();
		
		// 기본으로 생성되는 상품등록
		process.insertBasicProduct();
		
		// 관리자 계정 생성
		process.insertAdminUser();
		
		// 프로그램 시작
		start.start();
		
	}

}