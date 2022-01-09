package org.example1.java_jenkins_docker;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	@Test
	public void testInputIsEven()
	{
		assertTrue(App.checkInputIsAnEvenNumber(122));
	}
}
