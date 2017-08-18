package lotto;

import java.util.Scanner;

public class Input {

	public static int useMoney(Scanner scanner) {
		System.out.println("구입금액을 입력해 주세요.");
		int money = scanner.nextInt();
		scanner.nextLine();
		return money;
	}
	
	public static String winningNumber(Scanner scanner) {
		System.out.println("지난 주 당첨 번호를 입력해 주세요.(1,2,3,4,5,6,7)\n7번째는 보너스 번호, lottery입력시 랜덤 생성.");
		return scanner.nextLine();
	}
}
