package com.ontestautomation.jbehave.demo;

public class TestFlipper {
	
	public static void main (String args[]) {
		
		Flipper dc = new Flipper();
		
		System.out.println("Initial value is " + Integer.toString(dc.getValue()));
		System.out.println("Initial state is " + dc.getState());
		System.out.println("Set to even...");
		dc.setEven();
		System.out.println("Current value is " + Integer.toString(dc.getValue()));
		System.out.println("Current state is " + dc.getState());
		System.out.println("Flipping state...");
		dc.flipState();
		System.out.println("Current value is " + Integer.toString(dc.getValue()));
		System.out.println("Current state is " + dc.getState());
		System.out.println("Set to even...");
		dc.setEven();
		System.out.println("Current value is " + Integer.toString(dc.getValue()));
		System.out.println("Current state is " + dc.getState());
		System.out.println("Set to odd...");
		dc.setOdd();
		System.out.println("Current value is " + Integer.toString(dc.getValue()));
		System.out.println("Current state is " + dc.getState());
		System.out.println("Resetting state...");
		dc.resetState();
		System.out.println("Current value is " + Integer.toString(dc.getValue()));
		System.out.println("Current state is " + dc.getState());
		
	}
	
}