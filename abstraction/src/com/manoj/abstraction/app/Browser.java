package com.manoj.abstraction.app;

public class Browser {
	 Internet internet = new Router(); // loose coupling (reference of interface)
	// private Router router = new Router();

	public void connect() {
		System.out.println("invoking connect() in Browser");
		this.internet.connect();
		// this.router.connect();
	}

	public void setInternet(Internet internet) {
		this.internet = internet;
	}
	// tight coupling(changing implimenatation)
	// public void setInternet(Router router) {
	// this.router = router;
	// }

}
