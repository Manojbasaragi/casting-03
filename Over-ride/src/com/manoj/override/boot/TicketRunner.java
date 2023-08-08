package com.manoj.override.boot;

import com.manoj.override.app.Ticket;
import com.manoj.override.app.VIPTicket;

public class TicketRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in TicketRunner");

		Ticket ticket = new VIPTicket();
		ticket.showPrice();

	}

}
