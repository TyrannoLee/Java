package RamdomN;

class ClassCleaner {
	ClassCleaner() {
	}

	String[] name = { "철수", "민지", "영희", "훈이", "짱구", "나리", "연지", "강준", "동건", "주혁" };

	void doSuffle() {
		for (int i = 0; i < 30; i++) { // 0~29 (30번) 섞기
			String imsi = "";
			int nasu = (int) (Math.random() * 9);
			imsi = name[0];
			name[0] = name[nasu];
			name[nasu] = imsi;
		}
	}

	void getName() {
		for (int i = 1; i <= 2; i++) {
			System.out.println(name[i]);
		}
	}

}
