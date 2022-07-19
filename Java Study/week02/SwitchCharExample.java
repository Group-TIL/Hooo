package sec02.exam02_switch;

public class SwitchCharExample {

	public static void main(String[] args) {
		
		char grade = 'B';
		
		switch(grade) {
			case 'A':
			case 'a': // 대소문자 관계없이 'a'가 입력되면 우수회원
				System.out.println("우수회원입니다.");
				break;
			case 'B':
			case 'b':
				System.out.println("일반회원입니다.");
				break;
			default:
				System.out.println("손님입니다.");
				
			
		}

	}

}
