package sec06.exam03_array_length;

public class ArrayLengthExample {
	
	public static void main(String[] args) {
		
		int[] scores = {83,90, 87};
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) {// array.length: 읽기전용, 파이썬의 len()메서드와 비슷
			sum += scores[i];
		}
		System.out.println("총합: " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("평균" + avg);
		
	}
}
