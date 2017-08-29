import java.util.Scanner;

public class DataTypes001Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input a degree in Fahrenheit: ");
		double value = scanner.nextDouble();
		scanner.close();
		
		double result = fahrenheitToCelsius(value);
		System.out.println("\n" + value + " degree Fahrenheit is equal to " + result + " in Celsius");
	}

	private static double fahrenheitToCelsius(double value) {
		return (value - 32) / 1.8;
	}

}
