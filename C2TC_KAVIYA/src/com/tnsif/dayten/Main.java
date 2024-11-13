package com.tnsif.dayten;
public class Main {
	public static void main(String[] args) {
		Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();
        // Demonstrating polymorphism by calling move() on each vehicle
        car.move();       // Calls the move() method of Car
        bicycle.move();   // Calls the move() method of Bicycle
    }
}

