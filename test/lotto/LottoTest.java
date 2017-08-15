package lotto;

import static org.junit.Assert.*;

import java.util.ArrayList;
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
	public void inputTest() {
		int value = lotto.getBuyingMoney(scanner);
		assertEquals(5000, value);
	}

	@Test
	public void volumeTest() throws Exception {
		assertEquals(5, lotto.countOfLotto(5000));
	}

	@Test
	public void winningNumberTest() throws Exception {
		assertEquals("1,2,3,4,5,7", lotto.getWinningNumber(scanner));
	}

	@Test
	public void makeWinningLottoTest() throws Exception {
		ArrayList<Integer> winningLotto = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			winningLotto.add(i + 1);
		}
		assertEquals(winningLotto, lotto.getMachineLotto("1,2,3,4,5,6"));
	}

}
