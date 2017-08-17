package lotto;

public class Money {
	private int money;

	Money(int money) {
		this.money = money;
	}

	public int getMoney() {
		return money;
	}

	public int lottoVolume() {
		return money / 1000;
	}

}
