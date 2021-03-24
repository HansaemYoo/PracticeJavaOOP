package javaOOP003FunctionAndMethod;

//3. 함수와 메소드
public class FunctionTest {

	//메소드-객체의 기능을 구현하기 위해 클래스 내부에 구현되는 함수
	public static int addNum(int num1, int num2) {
		int result = num1 + num2; //반환타입은 똑같이
		return result;
	}
	
	public static void sayHello() { //void는 반환값이없다.
		System.out.println("안녕하세요.");
	}
	
	public static int calcSum() {
		int sum = 0;
		for(int i = 0; i<=100; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
	
		int num1 = 10;
		int num2 = 20;		
		int total = addNum(num1, num2);
		System.out.println(total);
		
		sayHello();
		
		int totalSum = calcSum();
		System.out.println(totalSum);
	}

}
