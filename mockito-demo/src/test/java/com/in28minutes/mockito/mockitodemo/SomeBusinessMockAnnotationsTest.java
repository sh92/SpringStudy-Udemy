package com.in28minutes.mockito.mockitodemo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockAnnotationsTest {

	@Mock
	DataService dataServiceMock;
	
	@InjectMocks
	SomeBusinessImpl businessImpl;
	
	
	@Test
	public void testfindTheGreatestFromAllData() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24,15,3});
		assertEquals(24, businessImpl.findTheGreatestFromAllData());
	}
	
	@Test
	public void testfindTheGreatestData_ForOneValue() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {15});
		assertEquals(15, businessImpl.findTheGreatestFromAllData());
	}
	
	@Test
	public void testfindTheGreatestData_NoValue() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {15});
		assertEquals(Integer.MIN_VALUE, businessImpl.findTheGreatestFromAllData());
	}
}
