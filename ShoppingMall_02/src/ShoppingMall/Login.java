package ShoppingMall;

import java.util.Scanner;

public class Login {
	
	public void login() {
		
		Scanner keyboard = new Scanner(System.in);

		System.out.println("계정 선택");
		System.out.println("========================");
		System.out.println("나가시려면 '0'을 누르십시오");
		System.out.print("Id를 입력하십시오 : ");
		String checkId = keyboard.next();
		String checkPassword;

		// 아이디 체크
		boolean firstExit = false;
		while(!firstExit) {
			// 입력된 아이디와 저장된 아이디를 비교
			for(int i=0; i<UserRepository.currentUserCount; i++) {
				// 입력된 아이디와 저장된 아이디가 같으면
				if(checkId.equals(UserRepository.user[i].getId())) {
					
					UserRepository.currentUser = i;
					firstExit = true;
					
				} else if(checkId.equals("0")) {
					
					Menu menu = new Menu();
					menu.menuList();
					break;
					
				} else {
					
					System.out.println("Id is not exist. Please try again."); 
					break;
					
				}
			}
			
		}
		
		// 비밀번호 체크
		boolean secondExit = false;
		while(!secondExit) {
			
			System.out.print("Password: ");
			checkPassword = keyboard.next();
			
			if(checkPassword.equals(UserRepository.user[UserRepository.currentUser].getPassword())) {
				
				System.out.println("환영합니다 " + checkId + "님");
				ProductList productList = new ProductList();
				productList.productList();
				secondExit = true;
				
			} else if(checkPassword.equals("0")){
				
				Menu menu = new Menu();
				menu.menuList();
				break;
				
			} else {
				
				System.out.println("Password is not correct. Please try again.");
				
			}
		}
	}
	
}