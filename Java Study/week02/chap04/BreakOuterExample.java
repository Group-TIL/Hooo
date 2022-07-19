package sec03.exam04_break;

public class BreakOuterExample {

	public static void main(String[] args) {
		
		Outer: for(char upper='A'; upper<='Z'; upper++) {
			
			for(char lower = 'a'; lower<='z'; lower++) {
				System.out.println(upper + "_" + lower);
				if(lower == 'g') {
					break Outer;
// 바깥쪽 for문 앞에 라벨을 붙여주면, 바깥쪽 for문도 반복 중지 시킬 수 있음
				}
			}
		}

	}

}
