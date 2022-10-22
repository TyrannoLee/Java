package Shopping;

/*티라노마트: 의류매장, 식품매장
 * 의류매장: 후리스(3만원), 티셔츠(4만원)
 * 식품매장: 군만두(오천원), 컵라면(800원)
 * 
 * 5만원으로 아래 제품을 구매한 후 잔액 출력
 * -의류 매장에서 후리스 구매
 * -식품 매장에서 군만두와 컵라면 구매
 * 
 */

class TyrannoMart{
	TyrannoMart(){}
	ClothingStore cs = new ClothingStore();
	FoodStore fs = new FoodStore();
}

//의류매장: 후리스(3만원),티셔츠(4만원)
class ClothingStore{
	ClothingStore(){}
	Fleece f = new Fleece();
	Tshirt t = new Tshirt();
}	

class Fleece{
	Fleece(){}
	int price = 30000;
}

class Tshirt{
	Tshirt(){}
	int price = 40000;
}

//식품매장: 컵라면(800원),만두(오천원)
class FoodStore{
	FoodStore(){}
	Noodle n = new Noodle();
	Mandu m = new Mandu();
}

class Noodle{
	Noodle(){}
	int price = 800;
}

class Mandu{
	Mandu(){}
	int price = 5000;
}


class Yeon{
	Yeon(){}
	int money = 50000;
	void buyFleece(ClothingStore cs){
		if(money >= cs.f.price){
		money = money - cs.f.price;
		System.out.println
		(cs.f.price+"원"+" 후리스구매 :");
		System.out.println
		("Yeon 소지금액: "+money+"\n");

		}else {
		System.out.println
		("후리스를 구매할 수 없습니다."
		+ "\n소지금액이 부족합니다.\n");
		}
	}
	
	void buyNoodle(FoodStore ms){
		if(money >= ms.n.price){
		money = money - ms.n.price;
		System.out.println
		(ms.n.price+"원"+" 컵라면구매 :");
		System.out.println
		("Yeon 소지금액: "+money+"\n");
		}else {
		System.out.println
		("컵라면을 구매할 수 없습니다. "
		+ "\n소지금액이 부족합니다.\n");
		}
	}
	
	void buyMandu(FoodStore ms){
		if(money >= ms.m.price){
		money = money - ms.m.price;	
		System.out.println
		(ms.m.price+"원"+" 만두구매 :");
		System.out.println
		("Yeon 소지금액: "+money+"\n");
		}else {
		System.out.println
		("만두을 구매할 수 없습니다. "
		+ "\n소지금액이 부족합니다.\n");
		}
	}
}
	
