package sec01.exam01_variable;

public class LiteralExample {
	public static void main(String[] args) {
		int var1 = 10;
		System.out.println(var1);
		
		int var2 = 010; // 0으로 시작되는 리터럴은 8진수로 간주
		System.out.println(var2);
		
		int var3 = 0x10; // 0x로 시작되는 리터럴은 16진수로 간주
		System.out.println(var3);
		
		
		double var4 = 0.25;
		System.out.println(var4);
		
		double var5 = 2E5; // 2 x 10의 5승
		System.out.println(var5);
		
		
		char var6 = 'A';
		System.out.println(var6);
		
		char var7 = '한';
		System.out.println(var7);
		
		System.out.println('\t'+ "들여쓰기");
		System.out.println("대한" + '\n' + "민국");
		System.out.println("This" + '\'' + "s Java");
		System.out.println("이것은" + '\"' + "중요" + '\"' + "합니다.");
		System.out.println("가격이" + '\\' + "300입니다.");
		
		char var8 = '\u0041'; // 16진수 41 = 10진수 65의 유니코드(A)
		System.out.println(var8);
		
		System.out.println("대한"+"민국");
		System.out.println("java" + 8);
		
		String var9 = "자바";
		
		
		boolean var10 = true;
		boolean var11 = false;
		System.out.println(var10);
		
		
		
		
		
		
		
		
		
		
	}
}
