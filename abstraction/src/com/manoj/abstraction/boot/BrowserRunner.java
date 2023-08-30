package com.manoj.abstraction.boot;

import com.manoj.abstraction.app.Browser;
import com.manoj.abstraction.app.Internet;
import com.manoj.abstraction.app.Router;

public class BrowserRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in BrowserRunner");
		Internet internet = new Router();

		Browser browser = new Browser();
		browser.connect();
		browser.setInternet(internet);

		// Router router = new Router();
		// Browser browser = new Browser();
		// browser.connect();
		// browser.setInternet(router);

	}

}
