package lotto;

public class Result {
	private int countOfMatch3;
	private int countOfMatch4;
	private int countOfMatch5;
	private int countOfMatch6;

	Result() {
		countOfMatch3 = 0;
		countOfMatch4 = 0;
		countOfMatch5 = 0;
		countOfMatch6 = 0;
	}

	public void setMatch(int count) {
		switch (count) {
		case 3:
			countOfMatch3++;
			break;
		case 4:
			countOfMatch4++;
			break;
		case 5:
			countOfMatch5++;
			break;
		case 6:
			countOfMatch6++;
			break;
		default:
			break;
		}
	}
	
	public int getCountOfMatch3() {
		return countOfMatch3;
	}

	public int getCountOfMatch4() {
		return countOfMatch4;
	}

	public int getCountOfMatch5() {
		return countOfMatch5;
	}

	public int getCountOfMatch6() {
		return countOfMatch6;
	}

	public int getRate(int money) {
		double total = countOfMatch3 * 5000 + countOfMatch4 * 50000 + countOfMatch5 * 1500000 + countOfMatch6 * 2000000000;
		return (int)((total / money) * 100);
	}
}
