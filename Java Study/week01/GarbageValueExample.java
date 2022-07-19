package sec02.exam01_byte;

public class GarbageValueExample {

	public static void main(String[] args) {
		
		byte var1 = 125;
		
		var1++; // 증가 연산자
		System.out.println(var1);
		
		var1++; 
		System.out.println(var1);
		
		var1++; // 실행 중 값의 범위를 초과할 경우
		// 최소값부터 다시 반복 저장
		// 127 --> -128부터 다시 반복 저장
		System.out.println(var1); 
		
		
		int var2 = 125;
		for (int i=0; i<5; i++) {
			var1++;
			var2++;
			System.out.println("var1:" + var1 + "\t" + "var2:" + var2);
			
		}

	}

}
