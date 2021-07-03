
public class Calculator {

	private int firstNum;
	private int secondNum;
	
	public Calculator() {

	}
	
	public Calculator(int firstNum, int secondNum) {
		this.firstNum = firstNum;
		this.secondNum = secondNum;
	}
	
	public int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	public int subtract(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
	
	public int multiply(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}

	public int divide(int num1, int num2) {
		int result = num1 / num2;
		return result;
	}
	
	public int square(int num1) {
		int result = num1 * num1;
		return result;
	}

	public static void main(String[] args) {
		Calculator electricAbacus = new Calculator();
		
		System.out.println(electricAbacus.add(6,3));
		System.out.println(electricAbacus.subtract(6,3));
		System.out.println(electricAbacus.multiply(6,3));
		System.out.println(electricAbacus.divide(6,3));
		System.out.println(electricAbacus.square(6));
	}

}
