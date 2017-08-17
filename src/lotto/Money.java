package lotto;

public class Money {
	private int money;
	private int volume;

	Money(int money) {
		this.money = money;
		volume = money / 1000;
	}

	public int getMoney() {
		return money;
	}

	public int getVolume() {
		return volume;
	}

}
