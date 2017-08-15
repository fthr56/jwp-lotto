package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
	int calculator(String text) {

		text = customDelimiter(text);
		String[] values = text.split(" |,|:");

		char checkNum = values[1].charAt(0);
		if (checkNum >= '0' && checkNum <= '9') {
			return onlyAdd(values);
		}
		return original(values);
	}

	String customDelimiter(String text) {

		Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
		if (m.find()) {
			String customDelimiter = m.group(1);
			text = m.group(2).replace(customDelimiter, " ");
		}
		return text;
	}

	int onlyAdd(String[] values) {
		Number number = new Number(values[0]);
		for (int i = 1; i < values.length; i++) {
			number.calculate(new Number(values[i]));
		}
		return number.getNumber();
	}

	int original(String[] values) {
		Number number = new Number(values[0]);
		for (int i = 1; i < values.length; i += 2) {
			number.calculate(values[i], new Number(values[i + 1]));
		}
		return number.getNumber();
	}
}
