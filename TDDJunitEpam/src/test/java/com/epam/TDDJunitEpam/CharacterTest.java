package com.epam.TDDJunitEpam;

import static org.junit.Assert.*;

import org.junit.Test;

public class CharacterTest {

	@Test
	public void testRemove() {
		RemoveAs remove=new RemoveAs();
		String actual=remove.remove2("ABC");
		assertEquals("BC",actual);
		//fail("Not yet implemented");
	}

}