package lotto;

import java.util.Scanner;

public class LottoMain {
	public static void main(String[] args) {
		Machine machine = new Machine();
		Scanner scanner = new Scanner(System.in);

		System.out.println("구입금액을 입력해 주세요.");
		int money = scanner.nextInt();
		scanner.nextLine();

		User user = new User(money);
		user.buyLottos(machine);
		System.out.println(money/1000 + "개를 구매했습니다.");

		user.showLottos();

		System.out.println("지난 주 당첨 번호를 입력해 주세요.");
		String winningString = scanner.nextLine();
		Lotto winningLotto = machine.createWinningLotto(winningString);

		winningLotto.showLotto();
		user.matchLottos(winningLotto);
		
		user.showResult();
		
		scanner.close();

	}

}
