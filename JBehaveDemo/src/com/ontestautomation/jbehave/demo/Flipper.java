package com.ontestautomation.jbehave.demo;

public class Flipper {
	
	public int value;
	public String state;
	
	// constructor
	public Flipper() {
		this.value = 1;
		this.state = "odd";
	}
	
	// set value
	public void setValue(int value) {
		this.value = value;
		if (value % 2 == 0) {
			this.state = "even";
		} else {
			this.state = "odd";
		}
	}
	
	// return current value
	public int getValue() {
		return this.value;
	}
	
	// return current state
	public String getState() {
		return this.state;
	}
	
	
	// flip state (from odd to even or the other way round) and increase the value by 1
	public void flipState() {
		if (this.value % 2 == 1) {
			this.state = "even";
		}
		else {
			this.state = "odd";
		}
		this.value += 1;
	}
	
	// reset to initial state and value 
	public void resetState() {
		this.value = 1;
		this.state = "odd";
	}
	
	// set state to even and adjust value if necessary
	public void setEven() {
		if (this.value % 2 == 1) {
			this.value += 1;
		}
		this.state = "even";
	}
	
	// set state to odd and adjust value if necessary
	public void setOdd() {
		if (this.value % 2 == 0) {
			this.value += 1;
		}
		this.state = "odd";
	}
}