package com.Rowboat;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Boat b1 = new Boat();
        Sailboat b2 = new Sailboat();
        Rowboat b3 = new Rowboat();
        b2.setLength(32);
        b1.move();
        b3.move();
        b2.move();

    }
}
