package lotto;

import java.util.ArrayList;

public class Lotto {

	private ArrayList<Integer> lottoNumbes;
//	private int bonusNumber;

	Lotto(ArrayList<Integer> lotto) {
		this.lottoNumbes = lotto;
	}

	////
	public void showLotto() {
		System.out.println(this.lottoNumbes);
	}
	////


//	public void setterBonus(Scanner scanner) {
//		System.out.println("보너스 번호를 입력 하세요.");
//		bonusNumber = scanner.nextInt();
//	}

	public int matchLotto(Lotto winningLotto) {
		int count = 0;
		for (Integer number : winningLotto.lottoNumbes) {
			count += matchNumber(number);
		}
		// System.out.println("count =" + count);
		return count;
	}

	int matchNumber(int number) {
		if (this.lottoNumbes.contains(number)) {
			return 1;
		}
		return 0;
	}

//	int bonusCheck(Lotto winningLotto) {
//		if (this.lottoNumbes.contains(winningLotto.getBonusNumber())) {
//			return 7;
//		}
//		return 5;
//	}

//	public int getBonusNumber() {
//		return bonusNumber;
//	}

}
