package calculator;

import java.util.Scanner;

public class Input {
	private String input;
	
	public Input() {
		System.out.print("계산을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		this.input = sc.nextLine();
		sc.close();
	}
	
	public String getInput() {
		return input;
	}

}
