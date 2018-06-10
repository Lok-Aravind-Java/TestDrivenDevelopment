package formula;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class AplusBSquaretest {

	private AplusBSquare abc;

	@Before
	public void setUp() {
		abc = new AplusBSquare();
	}

	@Test
	public void threePlus5Square() {
		int a = abc.AplusBWholeSquare(3, 5);
		assertEquals(64, a);

	}

	@Test
	public void eightPlus15Square() {
		int a = abc.AplusBWholeSquare(8, 15);
		assertEquals(529, a);

	}

	@Test
	public void zeroPlus0Square() {
		int a = abc.AplusBWholeSquare(0, 0);
		assertEquals(0, a);

	}

	@Test
	public void minus3PlusMinus5Square() {
		int a = abc.AplusBWholeSquare(-3, -5);
		assertEquals(64, a);

	}

	@Test
	public void minusthreePlus5Square() {
		int a = abc.AplusBWholeSquare(-3, 5);
		assertEquals(4, a);

	}

	
	@Test
	public void minusthreePlusMinus5Square() {
		int a = abc.AplusBWholeSquare(3, -5);
		assertEquals(4, a);

	}
}
