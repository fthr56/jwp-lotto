package lotto;

public class Result {
	private int countOfMatch3;
	private int countOfMatch4;
	private int countOfMatch5;
	private int countOfMatch6;
	private int countOfMatchBonus;

	Result() {
		countOfMatch3 = 0;
		countOfMatch4 = 0;
		countOfMatch5 = 0;
		countOfMatch6 = 0;
		countOfMatchBonus = 0;
	}

	public void updateResult(int count) {
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
			countOfMatchBonus++;
			break;
		default:
			break;
		}
	}

//	public Result addResult(Result result) {
//		this.countOfMatch3 += result.countOfMatch3;
//		this.countOfMatch4 += result.countOfMatch4;
//		this.countOfMatch5 += result.countOfMatch5;
//		this.countOfMatch6 += result.countOfMatch6;
//		this.countOfMatchBonus += result.countOfMatchBonus;
//		return this;
//	}

	public int getRate(int money) {
		double total = countOfMatch3 * 5000 + countOfMatch4 * 50000 + countOfMatch5 * 1500000
				+ countOfMatchBonus * 30000000 + countOfMatch6 * 2000000000;
		return (int) ((total / money) * 100);
	}

	public void showResult(Money money) {
		System.out.println("당첨 통계");
		System.out.println("--------------------");
		System.out.printf("3개 일치 (5000원)- %d개\n", this.countOfMatch3);
		System.out.printf("4개 일치 (50000원)- %d개\n", this.countOfMatch4);
		System.out.printf("5개 일치 (1500000원)- %d개\n", this.countOfMatch5);
		// System.out.printf("5개 일치, 보너스 볼 일치(30000000원)- %d개\n", this.countOfMatch6);
		System.out.printf("6개 일치 (2000000000원)- %d개\n", this.countOfMatch6);
		System.out.printf("총 수익률은 %d%%입니다.\n", getRate(money.getMoney()));
	}
}
