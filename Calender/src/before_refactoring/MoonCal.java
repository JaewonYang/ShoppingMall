package before_refactoring;

public class MoonCal {
	private int[] moonMon; // ������ �޺� ��¥���� ���� �迭
	private int date; // �����
	private int monNum; // ����ڰ� �? ��¥

	public MoonCal() {
		moonMon = new int[] { 30, 29, 30, 29, 30, 29, 30, 29, 30, 30/* ���� */,
				29, 30, 29 };
	}

	public void calculrateMoonDays(int a, int dayNum) {
		monNum = a - 1;

		for (int i = 0; i <= monNum; i++) {
			date = moonMon[i] + date; // ���� �޷��� �������� ��¥���� ���մϴ�.
		}
		date = date + (dayNum % 100);
	}

    public int getPassedmoonMon() {return date;}

}

