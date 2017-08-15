package calculator;

public class StringCalculatorMain {
	public static void main(String[] args) {
		StringCalculator temp = new StringCalculator();
		
		Input input = new Input();
		System.out.println("결과 값: " + temp.calculator(input.getInput()));
	}
}
