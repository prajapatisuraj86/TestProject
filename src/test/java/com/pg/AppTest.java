package com.pg;

import com.pg.App;
import org.junit.Assert;
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
