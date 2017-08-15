package calculator;

public class Number {
	int number;
	
	public Number(String string) {
		this. number = Integer.parseInt(string);
	}
	
	public int getNumber() {
		return number;
	}
	
	public int calculate(String string, Number second) {
		Operator oper = new Operator(string);
		number = oper.cal(this.number, second.number);
		return number;
	}
	public int calculate(Number nextInt) {
		Operator oper = new Operator("+");
		number = oper.cal(this.number, nextInt.number);
		return number;
	}
}
