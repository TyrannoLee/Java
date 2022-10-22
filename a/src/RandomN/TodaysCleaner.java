package RamdomN;

public class TodaysCleaner {

	public static void main(String[] args) {
		ClassCleaner who = new ClassCleaner();
		System.out.println("[오늘의 교실 청소당번]");
		who.doSuffle();
		who.getName();
	}

}
