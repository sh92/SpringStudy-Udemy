package com.in28minutes.mockito.mockitodemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomeBusinessTest {

	@Test
	public void testfindTheGreatestFromAllData() {
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
		int result = businessImpl.findTheGreatestFromAllData();
		
		assertEquals(24, result);
		
	}

}

class DataServiceStub implements DataService {
	
	public int[] retrieveAllData() {
		return new int[] {24, 6, 15};
	}
}
