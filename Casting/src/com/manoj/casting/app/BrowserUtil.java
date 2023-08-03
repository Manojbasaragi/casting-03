package com.manoj.casting.app;

public class BrowserUtil {

	public static void run() {
		
		Browser browser = new ChromBrowser();
		//or Browser browser = new OperaBrowser();
		// or Browser browser = new FireFox();
		// or Browser browser = new Edge();
		System.out.println(browser.name);
		browser.search();

		if (browser instanceof ChromBrowser) {
			ChromBrowser chromBrowser = (ChromBrowser) browser;
			System.out.println(chromBrowser.size);
			chromBrowser.getInformation();
		}
		if (browser instanceof OperaBrowser) {
			OperaBrowser operaBrowser = (OperaBrowser) browser;
			System.out.println(operaBrowser.developedBy);
			operaBrowser.browse();
		}
		if (browser instanceof FireFox) {
			FireFox fireFox = (FireFox) browser;
			System.out.println(fireFox.version);
			fireFox.openTab();
		}
		if (browser instanceof Edge) {
			Edge edge = (Edge) browser;
			System.out.println(edge.isPrivate);
			edge.closeTab();
		}

	}

}
