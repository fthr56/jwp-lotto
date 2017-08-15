package lotto;

import java.util.ArrayList;
import java.util.Scanner;
public class LottoMain {
	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		Scanner scanner = new Scanner(System.in);

		int money = lotto.getBuyingMoney(scanner);
		int volume = lotto.countOfLotto(money);
		
		ArrayList<Lotto> buyngLottos = lotto.buyAutoLottos(volume);
		
		String winningNumber = lotto.getWinningNumber(scanner);
		Lotto winningLotto = lotto.getMachineLotto(winningNumber);
		
		Result result = lotto.matchLotto(winningLotto, buyngLottos);
		lotto.showLottoReport(money, result);
	}

}
