package formula;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AminusBSquaree {
	
	private AminusBSquare amb;

	@Before
	public void setUp() throws Exception {
		amb = new AminusBSquare();
	}


	@Test
	public void fourMinus5Square() {
		int b = amb.AminusBWholeSquare(4, 5);
		assertEquals(1, b);
		
	}
	

	@Test
	public void  thirtyFiveMinus565Square() {
		int b = amb.AminusBWholeSquare(35, 56);
		assertEquals(441, b);
		
	}

	@Test
	public void zeroMinus0Square() {
		int b = amb.AminusBWholeSquare(0, 0);
		assertEquals(0, b);
		
	}

	@Test
	public void minusfourMinusMinus5Square() {
		int b = amb.AminusBWholeSquare(-4, -5);
		assertEquals(1, b);
		
	}
	

	@Test
	public void minusfourMinus5Square() {
		int b = amb.AminusBWholeSquare(-4, 5);
		assertEquals(81, b);
		
	}
	
	
	@Test
	public void fourMinusMinus5Square() {
		int b = amb.AminusBWholeSquare(4, -5);
		assertEquals(81, b);
		
	}

}
