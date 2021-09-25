package com.bridgelabz.WindChill;

import java.util.Scanner;

public class WindChill {
	private double t;
	private double v;
	
	public WindChill() {
		System.out.println("object has been created");
	}
	
	public void setT() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of temperature in ferenhite \n remember not to give temperature value larger than 50 ");
		this.t = sc.nextDouble();
		
	}
	
	public void setV() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter wind speed in miles per hour \n remenber the speed must range from 3 to 120");
		this.v = sc.nextDouble();
	}
	
	public double getT() {
		return this.t;
	}
	
	public double getV() {
		return this.v;
	}
	
	public void calcEffectiveTemperature() {
		if(this.t <= 50.0 && (this.v < 120.0 && this.v > 3.0) ) {
			System.out.println("Effective Temperature is : "+ (35.74 + (0.6215 * this.t )+ (((0.4275 * this.t) - 35.75) * (Math.pow(this.v, 0.16))) ));
		}
		else
			System.out.println("Invalid temperature or speed entered");
		
	}

}
