
public class MagicCalculator extends Calculator {

	private double numericalInput;
	
	public MagicCalculator() {

	}
	
	public MagicCalculator(double numericalInput) {
		this.numericalInput = numericalInput;
	}
	
	public double squareRoot(double numInput) {
		double result = Math.sqrt(numInput);
		return result;
	}
	
	public double sine(double numInput) {
		double result = Math.sin(numInput);
		return result;
	}
	
	public double cosine(double numInput) {
		double result = Math.cos(numInput);
		return result;
	}
	
	public double tangent(double numInput) {
		double result = Math.tan(numInput);
		return result;
	}
	
	public int factorial(int numInput) {
		
		int result = 1;
		
		for (int i = numInput; i> 0 ; i--) {
			result = result * i;
		}

		return result;
	}

	public static void main(String[] args) {
		MagicCalculator electricMagicalAbacus = new MagicCalculator();
		
		// Extended functionality
		System.out.println(electricMagicalAbacus.squareRoot(36));
		System.out.println(electricMagicalAbacus.sine(35));
		System.out.println(electricMagicalAbacus.cosine(35));
		System.out.println(electricMagicalAbacus.tangent(35));
		System.out.println(electricMagicalAbacus.factorial(6));
		
		// Existing Basic functionality
		System.out.println(electricMagicalAbacus.add(6,3));
		System.out.println(electricMagicalAbacus.subtract(6,3));
		System.out.println(electricMagicalAbacus.multiply(6,3));
		System.out.println(electricMagicalAbacus.divide(6,3));
		System.out.println(electricMagicalAbacus.square(6));

	}

}
