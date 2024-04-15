package main;

public class Ex1 {

	public static void main(String[] args) {

//		Calc calc = new calc();
		
		Calculator calculator = new Calculator();
		
		System.out.println(calculator.add(10,5));
		System.out.println(calculator.substract(10,5));
		System.out.println(calculator.times(10,5));
		System.out.println(calculator.divide(10,5));
	}

}

class Calculator implements Calc {

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		return num1 / num2;
	}
	
	// 정보를 출력하는 메소드 추가
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}
}