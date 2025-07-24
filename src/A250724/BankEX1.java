package A250724;

import java.util.Scanner;

class BankAccount{
	String name = "홍길동";
	String account = "H1234";
	int balance = 0;
			
public BankAccount(String name, String account, int balance) {
		this.name = name;
		this.account = account;
		this.balance = balance;
	}
	void deposit(int num) {
		balance += num;
	}
	void withdraw(int num) {
		balance -= num;
	}
	
}

public class BankEX1 {

	public static void main(String[] args) {
//		String name = "홍길동";
//		String account = "H1234"; 
		boolean run = true;
		boolean login = false;
//		int balance = 0;
		Scanner sc = new Scanner(System.in);
		
		BankAccount ba = new BankAccount("홍길동", "H1234", 10000);
		
		while(run) {
			if(login == false) {
				System.out.println("-----------------------------");
				System.out.println("1. 로그인 | 2. 회원가입 | 3. 종료");
				System.out.println("-----------------------------");
				System.out.println("선택> ");
				int num = Integer.parseInt(sc.nextLine());
				switch (num) {
				
				case 1:
					System.out.println("이름> ");
					String str1 = sc.nextLine();
					System.out.println("계정> ");
					String str2 = sc.nextLine();
					if (str1.equals (ba.name) && str2.equals(ba.account)) {
						System.out.println("로그인 성공");
						login = true;
					} else {
						System.out.println("로그인 실패");
					}
					break;
				
				case 2:
					System.out.print("이름> ");
					ba.name = sc.nextLine();
					System.out.println("계정> ");
					ba.account = sc.nextLine();
					break;
				
				case 3:
					run = false;
					break;
				}
			}
			if (login) {
				System.out.println("------------------------------------");
				System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 로그아웃");
				System.out.println("------------------------------------");
				System.out.println("선택> ");
			
				int num = Integer.parseInt(sc.nextLine());
			
				switch (num) {
			
				case 1:
					System.out.print("예금액>");
					ba.balance += num;
//					balance += num;
					break;
				
				case 2:
					System.out.print("출금액> ");
					ba.balance -= num;
//					balance -= num;
					break;
				
				case 3:
					System.out.print("잔고>"+ba.balance);
//					System.out.println(balance);
					break;
				
				case 4:
					run = false;
					login = false;
					break;
				}
				
			}
			System.out.println();
		}
		
		System.out.println("프로그램 종료");
	}

}
