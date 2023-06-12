package com.rakib.object_class;

public class BiCycle {

	private int cadence = 0;
	private int speed = 0;
	private int gear = 1;
	
	public void changeCadence ( int newValue )
	{
		cadence = newValue;
	}
	
	public void changeGear( int newValue )
	{
		gear = newValue;
	}
	
	public void speedUp ( int increment )
	{
		speed = speed + increment;
	}
	
	public void applyBreaks ( int decrement )
	{
		speed = speed - decrement;
	}
	
	public void printStates() {
		System.out.println("Cadence : " + cadence + " Speed : " + speed + " Gear : " + gear);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiCycle obj = new BiCycle ();
		
		obj.changeCadence(5);
		obj.changeGear(3);
		obj.speedUp(50);
		
		obj.printStates();

	}

}
