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
		App ex1 = new App();
		
		Assert.assertEquals(ex1.calculateSquare(2), 4);
    }
}
