package lotto;

import java.util.List;

public class User {
	private List<Lotto> buyLottos;
	private Money money;
	private Result result = new Result();

	User(int money) {
		this.money = new Money(money);
	}

	public void buyLottos(Machine machine) {
		buyLottos = machine.createLottos(money);
	}

	public void showLottos() {
		for (Lotto buyLotto : buyLottos) {
			buyLotto.show();
		}
		money.showLottoVolume();
	}

	public void showResult() {
		result.showResult(money);
	}

	public void matchLottos(Machine machine, String winningString) {
		Lotto winningLotto = machine.createWinningLotto(winningString);
		for (Lotto lotto : buyLottos) {
			result.update(winningLotto.matchLotto(lotto));
		}
	}
}
