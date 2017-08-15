package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lotto {

	private ArrayList<Integer> lottoNos;
	private int bonusNumber;
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
//		System.out.println("보너스 번호를 입력 하세요.");
//		setterBonus(scanner.nextInt());
		return winningLotto;
	}
	
	public void setterBonus(Scanner scanner) {
		System.out.println("보너스 번호를 입력 하세요.");
		bonusNumber = scanner.nextInt();
	}
	
	Lotto getMachineLotto(String winningLotto) {
		lottoNos = new ArrayList<>();
		if(winningLotto.equals("lottery")) {
			return buyAutoLotto();
		}
		String[] winningLottoArray = winningLotto.split(",");
		for (int i = 0; i < winningLottoArray.length; i++) {
			lottoNos.add(Integer.parseInt(winningLottoArray[i]));
		}
		return new Lotto(lottoNos);
	}

	Result matchLotto(Lotto winningLotto, ArrayList<Lotto> buyngLottos) {
		Result result = new Result();
		for(Lotto lotto : buyngLottos)
		{
			result = result.addResult(lotto.matchLotto(winningLotto));
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
		if(count == 5) {
			count = bonusCheck(winningLotto);
		}
		result.setMatch(count);
		return result;
	}
	
	int bonusCheck(Lotto winningLotto) {
		if(lottoNos.contains(winningLotto.getBonusNumber())) {
			return 7;
		}
		return 5;
	}
	
	public int getBonusNumber() {
		return bonusNumber;
	}

	void showLottoReport(int money, Result result) {
		System.out.println("당첨 통계");
		System.out.println("--------------------");
		System.out.printf("3개 일치 (5000원)- %d개\n", result.getCountOfMatch3());
		System.out.printf("4개 일치 (50000원)- %d개\n", result.getCountOfMatch4());
		System.out.printf("5개 일치 (1500000원)- %d개\n", result.getCountOfMatch5());
		System.out.printf("5개 일치, 보너스 볼 일치(30000000원)- %d개\n", result.getCountOfMatch7());
		System.out.printf("6개 일치 (2000000000원)- %d개\n", result.getCountOfMatch6());
		System.out.printf("총 수익률은 %d%%입니다.\n", result.getRate(money));
	}
}
