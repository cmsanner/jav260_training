package com.entertainment.catalog;

import static org.junit.Assert.*;


import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.entertainment.Television;

public class CatalogTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testfindByBrand() {
//		//fail("Not yet implemented");
		Collection<Television> tvs=Catalog.findByBrand("RCA");
	}

}
