package com.manoj.java_10_08.ruuner;

import com.manoj.java_10_08.app.RedBus;

public class RedBudRunner {

	public static void main(String[] args) {
		RedBus myRedBusBooking = new RedBus();

		myRedBusBooking.setUserName("manojbasaragi");
		myRedBusBooking.setFullName("Manoj Basaragi");
		myRedBusBooking.setEmail("manu@gmail.com");
		myRedBusBooking.setPhoneNumber("+9845678374");
		myRedBusBooking.setBoardingPoint("Hubli");
		myRedBusBooking.setDestination("Bangalore");
		myRedBusBooking.setTravelDate("2023-08-15");
		myRedBusBooking.setBookingReference("RB123456");
		myRedBusBooking.setSeatsBooked(2);
		myRedBusBooking.setTotalFare(100.00);
		myRedBusBooking.setBusType("Sleeper");
		myRedBusBooking.setRoundTrip(false);
		myRedBusBooking.setCancelled(false);

		System.out.println("User Name: " + myRedBusBooking.getUserName());
		System.out.println("Full Name: " + myRedBusBooking.getFullName());
		System.out.println("Email: " + myRedBusBooking.getEmail());
		System.out.println("Phone Number: " + myRedBusBooking.getPhoneNumber());
		System.out.println("Boarding Point: " + myRedBusBooking.getBoardingPoint());
		System.out.println("Destination: " + myRedBusBooking.getDestination());
		System.out.println("Travel Date: " + myRedBusBooking.getTravelDate());
		System.out.println("Booking Reference: " + myRedBusBooking.getBookingReference());
		System.out.println("Seats Booked: " + myRedBusBooking.getSeatsBooked());
		System.out.println("Total Fare: " + myRedBusBooking.getTotalFare());
		System.out.println("Bus Type: " + myRedBusBooking.getBusType());
		System.out.println("Round Trip: " + myRedBusBooking.isRoundTrip());
		System.out.println("Cancelled: " + myRedBusBooking.isCancelled());
	}

}
