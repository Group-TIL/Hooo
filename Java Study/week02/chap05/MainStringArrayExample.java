package sec06.exam04_main_argument;

public class MainStringArrayExample {

	public static void main(String[] args) {
		
		if(args.length != 2) {
			System.out.println("프로그램의 사용법");
			System.out.println("java sec06.exam04_main_argument.MainStringArrayExample num1 num2");
			System.exit(0); // jvm 종료
		}
		
		String strNum1 = args[0]; // "3"
		String strNum2 = args[1]; // "5"
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
		
	}

}
