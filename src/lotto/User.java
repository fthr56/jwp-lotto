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
		money.howMany();
	}

	public void showResult() {
		result.showResult(money);
	}

	public Result matchLottos(Lotto winningLotto) {
		for (Lotto lotto : buyLottos) {
			result.updateResult(winningLotto.matchLotto(lotto));
		}
		return result;
	}
}
