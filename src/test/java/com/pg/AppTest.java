package com.pg;

import com.pg.App
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    
	@Test
    public void testApp()
    {
		Assert.assertEquals(App.calculateSquare(2) == 4);
    }
}
