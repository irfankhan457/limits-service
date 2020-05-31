package com.khan.microservices.limitsservice;

public class LimitConfiguration {
	private int maximum;
	private int minimum;
	
	public LimitConfiguration(int i, int j) {
		this.maximum = i;
		this.minimum = j;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
}
