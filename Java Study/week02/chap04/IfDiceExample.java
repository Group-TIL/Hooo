package sec01.exam01_if;

public class IfDiceExample {

	public static void main(String[] args) {
		
		int num = (int)(Math.random()*6) + 1; // int 강제 타입변환
		// Math.random() : 0 과 1 사이 랜덤 숫자 생성
		// 0 <= n < 1
		// 0 <= 6n < 6
		// 1 <= 6n+1 < 7
		// (int) 1 <= 6n+1 < 7 : 1,2,3,4,5,6
		
		if(num == 1) {
			System.out.println("1번이 나왔습니다.");
		} else if(num == 2) {
			System.out.println("2번이 나왔습니다.");
		} else if(num == 3) {
			System.out.println("3번이 나왔습니다.");
		} else if(num == 4) {
			System.out.println("4번이 나왔습니다.");
		} else if(num == 5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		}

	}

}
