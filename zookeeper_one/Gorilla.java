package com.laho.zookeeper_one;

public class Gorilla extends Mammal {
	
	public Gorilla(int energyLevel) {
		super(energyLevel);
	}
	
	public void throwSomething() {

		int nErrGeeLvl = getEnergyLevel();
		setEnergyLevel( nErrGeeLvl - 5 );
		System.out.println("Gorilla tosses a stone. -5 energy spent.");
		System.out.println(nErrGeeLvl + " energy remaining");
	}
	
	//REFACTORED:
	public void eatBanana() {
		setEnergyLevel(+ 10);
		System.out.println("eating bananas");

	}
	public void climb() {
		setEnergyLevel(-10);
		System.out.println("climbing stuff here");

	}

}