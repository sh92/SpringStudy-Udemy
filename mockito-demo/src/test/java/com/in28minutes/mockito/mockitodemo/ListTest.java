package com.in28minutes.mockito.mockitodemo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;


import java.awt.List;

import org.junit.Test;

public class ListTest {

	@Test
	public void test() {
		List listMock = mock(List.class);
		when(listMock.getItemCount()).thenReturn(10);
		assertEquals(10, listMock.getItemCount());
	}

}
