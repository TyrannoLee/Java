package RandomE;

/*세계의 15개의 관광지가 있습니다.
 * (ex> "미국 뉴욕", "프랑스 에펠탑", "런던 빅벤", "일본 도쿄" ...)
 * 이 중에서 방문할 5개의 관광지를 중복되지 않게 출력합니다.
 */


class HotSpotSystem {

	HotSpotSystem() {}
		// String 타입의 15개의 관광지들을 받는 배열 선언
		String[] hotSpot = { "한국 서울", "한국 제주도", "한국 부산", "일본 오사카", "일본 도쿄", "프랑스 파리", "영국 런던", "미국 로스앤젤레스", "러시아 모스크바",
				"체코 프라하", "독일 베를린", "태국 방콕", "대만 타이베이", "대만 가오슝", "이탈리아 로마" };
	

	void doSuffle() { 
		for (int i = 0; i < 100; i++) {
			String imsi = ""; 
			int nansu = (int) (Math.random() * 15); // 0~14 난수 발생 
			imsi = hotSpot[0];
			hotSpot[0] = hotSpot[nansu];
			hotSpot[nansu] = imsi;
		}
	}

	void choiceFiveSpot() {
		for (int i = 1; i <= 5; i++) { // 1~5
			System.out.println(i+ "번쨰로 선택된 관굉지는 " + hotSpot[i] + "입니다.");
		}
	}
}
