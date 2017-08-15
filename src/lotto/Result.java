package lotto;

public class Result {
	private int countOfMatch3;
	private int countOfMatch4;
	private int countOfMatch5;
	private int countOfMatch6;
	private int countOfMatch7;

	Result() {
		countOfMatch3 = 0;
		countOfMatch4 = 0;
		countOfMatch5 = 0;
		countOfMatch6 = 0;
		countOfMatch7 = 0;
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
		case 7:
			countOfMatch7++;
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

	public int getCountOfMatch7() {
		return countOfMatch7;
	}

	public Result addResult(Result result) {
		this.countOfMatch3 += result.countOfMatch3;
		this.countOfMatch4 += result.countOfMatch4;
		this.countOfMatch5 += result.countOfMatch5;
		this.countOfMatch6 += result.countOfMatch6;
		this.countOfMatch7 += result.countOfMatch7;
		return this;
	}

	public int getRate(int money) {
		double total = countOfMatch3 * 5000 + countOfMatch4 * 50000 + countOfMatch5 * 1500000 + countOfMatch7 * 30000000
				+ countOfMatch6 * 2000000000;
		return (int) ((total / money) * 100);
	}
}
