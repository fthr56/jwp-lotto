package calculator;

public class Operator {
	String symbol;
	
	public Operator(String oper) {
		this.symbol = oper;
	}
	
	public int cal(int first, int second) {
		switch(symbol) {
		case "+":
			return first + second;
		case "-":
			return first - second;
		case "*":
			return first * second;
		case "/":
			return first / second;
		}
		return 0;
	}

}
