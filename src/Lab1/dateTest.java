package Lab1;
import static org.junit.Assert.*;

import org.junit.Test;

public class dateTest {
	
	Date d1 = new Date(2002, 9, 11);
	Date d2 = new Date(2003, 3, 2);

	@Test
	public void test1() {
		assertEquals(171, d1.daysTo(d2));
	}
	
	Date d3 = new Date(2008, 1, 1);
	Date d4 = new Date(2007, 1, 1);

	@Test
	public void test2() {
		assertEquals(-365, d3.daysTo(d4));
	}
	
	Date d5 = new Date(2000, 1, 1);
	Date d6 = new Date(2001, 2, 1);
	
	@Test
	public void test3() {
		assertEquals(395, d5.daysTo(d6));
	}
	
}
