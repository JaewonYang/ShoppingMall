package before_refactoring;

public class SunCal {

	private int[] sunMon; // ����� �޺� ��¥���� ���� �迭
	private int date; // �����
	private int monNum; // ����ڰ� �? ��¥

	public SunCal() {
		sunMon = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	}

	public void calculrateSunDays(int a, int dayNum) {
		monNum = a - 1;

		for (int i = 0; i < monNum; i++) {
        date = sunMon[i] + date; // ��´޷��� �������� ��¥���� ���մϴ�.
    }
    date = date + (dayNum % 100);
	}

	public int getPassedsunMon() {return date;}
}
