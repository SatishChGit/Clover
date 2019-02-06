package sample;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class SquareTest {

	 @Parameters
	    public static Collection<Object[]> data() {
	        return Arrays.asList(new Object[][] {     
	                 { 0, 0 }, { 1, 1 }, { 2, 4 }
	           });
	    }

	    protected int input;
	    protected int expected;
	    public SquareTest(int input, int expected) {
	    	this.input = input;
	    	this.expected = expected;
	    }
	    
	@Test
	public void test() {
		assertEquals(expected, Square.square(input));
	}

}
