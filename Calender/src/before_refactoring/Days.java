package before_refactoring;

//기념일들의 날짜들과 이름, 양력, 음력을 구분해주는 키값을 가지고 있는 클래스
public class Days {

    private int[] dateArr;
    private int[] keyArr;
    private String[] daysStr;

    public Days() {
        dateArr = new int[]{101, 101, 301, 406, 505, 403, 606, 505, 717, 719,
                729, 808, 815, 922, 922, 1003, 1009, 1225};
        keyArr = new int[]{0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0};

        daysStr = new String[]{"신정", "설", "삼일절", "한식", "어린이날", "음력4월3일",
                "현충일", "단오", "제헌절", "칠월십구일", "칠월이십구일", "팔월팔일", "추석", "9월22일", "9월22일(윤달)",
                "개천절", "한글날", "크리스마스"};
    }

    public int[] getDateArr(){return dateArr;}
    public int[] getKeyArr(){return keyArr;}
    public String[] getStr(){return daysStr;}
}
