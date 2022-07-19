package sec03.exam01_for;

public class ForSumFrom1To100Example {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 0; // for문 바깥에서 초기화 : for문 빠져나와서도 사용하기 위함
		
		for(i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println("1~" + (i-1)+ "까지의 합: " + sum);
	} // i = 101일 때 for문에서 뺘져나옴

} 
