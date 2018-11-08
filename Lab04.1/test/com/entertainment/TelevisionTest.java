package com.entertainment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TelevisionTest {
	Television tv;// = new Television("Sony",20);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		tv = new Television("Sony",20);
		tv.changeChannel(9);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetVolume() {
		assertTrue(tv.getVolume()==20);
	}
	@Test
	public void testChangeChannel() {
		assertTrue(tv.getCurrentChannel()== 9);
	}
	@Test
	public void testChangeChannelInvalidChannelException() {
		
		try {
			tv.changeChannel(0); //should throw InvalidChannelException
			
			//if it doesnt throw exception then this is a problem
			fail("illegal channel, should have thown an exception.");
			
		}
		catch (InvalidChannelException e) {
			// verify exception message is correct
			assertEquals("Invalid channel 0 valid channels are between 1 and 999" , e.getMessage());
			//Invalid channel 0 valid channels are between 1 and 999
		}
		
	}

}
