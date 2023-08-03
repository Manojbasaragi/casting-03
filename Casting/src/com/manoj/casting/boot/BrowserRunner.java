package com.manoj.casting.boot;

import com.manoj.casting.app.Browser;
import com.manoj.casting.app.BrowserUtil;
import com.manoj.casting.app.ChromBrowser;
import com.manoj.casting.app.Edge;
import com.manoj.casting.app.FireFox;
import com.manoj.casting.app.OperaBrowser;

public class BrowserRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in BrowserRunner");
		//or Browser browser = new ChromBrowser();
		 Browser browser = new OperaBrowser();
		// or Browser browser = new FireFox();
		// or Browser browser = new Edge();
		System.out.println(browser.name);
		browser.search();

		//or ChromBrowser chromBrowser = (ChromBrowser) browser;
		 OperaBrowser operaBrowser = (OperaBrowser)browser;
		 System.out.println(operaBrowser.developedBy);
		 operaBrowser.browse();
		// or FireFox fireFox = (FireFox)browser;
		//or Edge edge = (Edge)browser;
		BrowserUtil.run();

	}

}
