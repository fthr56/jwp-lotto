package lotto;

import java.util.ArrayList;
import java.util.Collections;

public class Machine {

	public ArrayList<Lotto> createLottos(int volume) {
		ArrayList<Lotto> lottos = new ArrayList<>();
		for (int i = 0; i < volume; i++) {
			lottos.add(createLotto());
		}
		return lottos;
	}

	public Lotto createLotto() {
		ArrayList<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < 45; i++) {
			numbers.add(i + 1);
		}
		Collections.shuffle(numbers);
		numbers = new ArrayList<Integer>(numbers.subList(0, 6));
		Collections.sort(numbers);

		return new Lotto(numbers);
	}

	public Lotto createWinningLotto(String winningString) {
		
		if (winningString.equals("lottery")) {
			return createLotto();
		}
		
		ArrayList<Integer> winningLotto = new ArrayList<>();
		String[] winningStringArray = winningString.split(",");
		
		for (int i = 0; i < winningStringArray.length; i++) {
			winningLotto.add(Integer.parseInt(winningStringArray[i]));
		}

		return new Lotto(winningLotto);
	}
}
