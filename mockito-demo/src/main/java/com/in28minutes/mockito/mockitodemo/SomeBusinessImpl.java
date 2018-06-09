package com.in28minutes.mockito.mockitodemo;

public class SomeBusinessImpl {
	
	
	public SomeBusinessImpl(DataService dataServce) {
		super();
		this.dataServce = dataServce;
	}
	
	private DataService dataServce;
	int findTheGreatestFromAllData() {
		int[] data = dataServce.retrieveAllData();
		int greatest = Integer.MIN_VALUE;
		
		for (int value: data ) {
			if( value > greatest) {
				greatest = value;
			}
		}
		return greatest;
	}
}

interface DataService {
	int[] retrieveAllData();
}
