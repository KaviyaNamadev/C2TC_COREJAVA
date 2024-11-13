package com.tnsif.dayten;
public class Main {
	public static void main(String[] args) {
		Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();
        car.move();       // Calls the move() method of Car
        bicycle.move();   // Calls the move() method of Bicycle
    }
}

