package com.arjun.java.innerclasses;

public class VehicleType {
	
	interface Vehicle {
		public int getNoOfWheels();
	}
	
	class Bus implements Vehicle {
		@Override
		public int getNoOfWheels() {
			return 6;
		}
	}
	
	class Auto implements Vehicle {
		@Override
		public int getNoOfWheels() {
			return 3;
		}
	}
	
	public static void main(String[] args) {
		VehicleType.Auto auto = new VehicleType().new Auto();
		System.out.println("No of wheels in Auto: " + auto.getNoOfWheels());
	}

}
