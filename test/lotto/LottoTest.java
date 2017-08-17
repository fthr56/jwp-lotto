package lotto;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

public class LottoTest {
	Lotto lotto;
	Scanner scanner;

	@Before
	public void setup() {
		lotto = new Lotto();
		scanner = new Scanner(System.in);
	}

	@Test
	public void getButingMoneyTest() throws Exception {
		System.out.println("구입금액을 입력해 주세요.");
		int money = 5000;
		assertEquals(5000, money);
	}

	@Test
	public void countOfLottoTest() throws Exception {
		int volume = 5000 / 1000;
		System.out.println(volume + "개를 구매했습니다.");
		assertEquals(5, volume);
	}

	@Test
	public void buyAutoLottosTest() throws Exception {
		ArrayList<Lotto> lottos = lotto.buyAutoLottos(5);
		assertEquals(5,lottos.size());
	}
	
	@Test
	public void getWinningNumberTest() throws Exception {
		System.out.println("지난 주 당첨 번호를 입력해 주세요.");
		String winningNumber = "1,2,3,4,5,7";
//		winningNumber = "lottery";
		System.out.println(winningNumber);
		Lotto winningLotto = lotto.getMachineLotto(winningNumber);
	}
	
	@Test
	public void setterBonusTest() throws Exception {
			System.out.println("보너스 번호를 입력 하세요.");
			int bonusNumber = 32;
	}
	
}
