package lotto;

import java.util.ArrayList;

public class User {
	private ArrayList<Lotto> buyLottos = new ArrayList<>();
	private Money money;
	private Result result = new Result();

	User(int money){
		this.money = new Money(money);
	}

	public void buyLottos(Machine machine) {
		buyLottos = machine.createLottos(money);
	}

	public void showLottos() {
		for (Lotto buyLotto : buyLottos) {
			buyLotto.showLotto();
		}
	}

	public void matchLottos(Lotto winningLotto) {
		int count = 0;
		for (Lotto buyLotto : buyLottos) {
			count = buyLotto.matchLotto(winningLotto);
			result.updateResult(count);
		}
	}

	public void showResult() {
		result.showResult(money);
	}

	// Result matchLottos(Lotto winningLotto, ArrayList<Lotto> buyngLottos) {
	// Result result = new Result();
	// for(Lotto lotto : buyngLottos)
	// {
	// result = result.addResult(lotto.matchLotto(winningLotto));
	// }
	// return result;
	// }
	//
	// Result matchLotto(Lotto winningLotto) {
	// Result result = new Result();
	// int count = 0;
	// for(Integer number : winningLotto.lotto) {
	// count += matchNumber(winningLotto, number);
	// }
	// if(count == 5) {
	// count = bonusCheck(winningLotto);
	// }
	// result.setMatch(count);
	// return result;
	// }

}
