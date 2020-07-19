package com.alex.persist;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PersistTest {

	@Test
	public void BasicTests() {
		System.out.println("****** Basic Tests ******");
		// assertEquals(3, Persist.persistence(39));
		// assertEquals(0, Persist.persistence(4));
		// assertEquals(1, Persist.persistence(12));
		// assertEquals(2, Persist.persistence(25));
		// assertEquals(4, Persist.persistence(999));
		// assertEquals(1, Persist.persistence(164940));
		assertEquals(1, Persist.persistence(160943));

	}

}