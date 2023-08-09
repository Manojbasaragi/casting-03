package com.manoj.java_09_08.boot;

import com.manoj.java_09_08.app.FishMarket;
import com.manoj.java_09_08.app.Market;

public class MarketRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in MarketRunner");

		Market market = new FishMarket();
		market.sell();
		System.out.println("*********Child ref*************");
		FishMarket fishMarket = new FishMarket();
		fishMarket.sell();

	}

}
