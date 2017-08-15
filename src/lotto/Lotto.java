package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lotto {

	private ArrayList<Integer> lottoNos;

	Lotto() {
	}

	Lotto(ArrayList<Integer> lotto) {
		lottoNos = lotto;
	}

	int getBuyingMoney(Scanner scanner) {
		System.out.println("구입금액을 입력해 주세요.");
		int money = scanner.nextInt();
		scanner.nextLine();
		return money;
	}

	int countOfLotto(int money) {
		int volume = money / 1000;
		System.out.println(volume + "개를 구매했습니다.");
		return volume;
	}

	Lotto buyAutoLotto() {
		ArrayList<Integer> numbers = new ArrayList<>();
		lottoNos = new ArrayList<>();
		for (int i = 0; i < 45; i++) {
			numbers.add(i + 1);
		}
		Collections.shuffle(numbers);
		lottoNos = new ArrayList<Integer>(numbers.subList(0, 6));
		Collections.sort(lottoNos);
		System.out.println(lottoNos);
		return new Lotto(lottoNos);
	}

	ArrayList<Lotto> buyAutoLottos(int countOfLotto) {
		ArrayList<Lotto> lottos = new ArrayList<>();
		for (int i = 0; i < countOfLotto; i++) {
			lottos.add(buyAutoLotto());
		}
		return lottos;
	}

	String getWinningNumber(Scanner scanner) {
		System.out.println("지난 주 당첨 번호를 입력해 주세요.");
		String winningLotto = scanner.nextLine();
		System.out.println(winningLotto);
		return winningLotto;
	}

	Lotto getMachineLotto(String winningLotto) {
		lottoNos = new ArrayList<>();
		String[] winningLottoArray = winningLotto.split(",");
		for (int i = 0; i < winningLottoArray.length; i++) {
			lottoNos.add(Integer.parseInt(winningLottoArray[i]));
		}
		return new Lotto(lottoNos);
	}

	Result matchLotto(Lotto winningLotto, ArrayList<Lotto> buyngLottos) {
		Result result = new Result();
		for (int i = 0; i < buyngLottos.size(); i++) {
			Lotto myLotto = buyngLottos.get(i);
			result = myLotto.matchLotto(winningLotto);
		}
		return result;
	}

	Result matchLotto(Lotto winningLotto) {
		Result result = new Result();
		int count = 0;
		for(Integer each : winningLotto.lottoNos) {
			if(lottoNos.contains(each)) {
				count++;
			}
		}
		result.setMatch(count);
		return result;
	}
	
//	Result matchLotto(Lotto winningLotto)
//	Result addResult(Result result)
	
	void showLottoReport(int money, Result result) {
		System.out.println("당첨 통계");
		System.out.println("--------------------");
		System.out.printf("3개 일치 (5000원)- %d개\n", result.getCountOfMatch3());
		System.out.printf("4개 일치 (50000원)- %d개\n", result.getCountOfMatch4());
		System.out.printf("5개 일치 (1500000원)- %d개\n", result.getCountOfMatch5());
		System.out.printf("6개 일치 (2000000000원)- %d개\n", result.getCountOfMatch6());

		System.out.printf("총 수익률은 %d%%입니다.\n", result.getRate(money));
	}
}
