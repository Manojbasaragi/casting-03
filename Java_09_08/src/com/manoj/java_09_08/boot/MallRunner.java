package com.manoj.java_09_08.boot;

import com.manoj.java_09_08.app.Mall;
import com.manoj.java_09_08.app.OraienMall;

public class MallRunner {

	public static void main(String[] args) {
		System.out.println("invokin main in MallRunner");

		Mall mall = new OraienMall();
		mall.invite();
		System.out.println("**********Child ref**********");
		OraienMall oraienMall = new OraienMall();
		oraienMall.invite();

	}

}
