package katas;

import static org.junit.Assert.*;

import org.junit.Test;

public class LCDTesting {

	LCD lcd = new LCD(); 
	
	@Test
	public void test_for_1() {
		String result = lcd.GetNumber("1");
		assertEquals(
				"   \n" +
				"  |\n" +
				"  |", result);
	}
	
	@Test
	public void test_for_2() throws Exception {
		assertEquals(
				" _ \n" +
				" _|\n" +
				"|_ ", lcd.GetNumber("2"));
	}
	
	@Test
	public void test_for_3() throws Exception {
		assertEquals(
				" _ \n" +
				" _|\n" +
				" _|", lcd.GetNumber("3"));
	}

	@Test
	public void test_for_4() throws Exception {
		assertEquals(
				"   \n" +
				"|_|\n" +
				"  |", lcd.GetNumber("4"));
	}

	@Test
	public void test_for_5() throws Exception {
		assertEquals(
				" _ \n" +
				"|_ \n" +
				" _|", lcd.GetNumber("5"));
	}

	@Test
	public void test_for_6() throws Exception {
		assertEquals(
				" _ \n" +
				"|_ \n" +
				"|_|", lcd.GetNumber("6"));
	}

	@Test
	public void test_for_7() throws Exception {
		assertEquals(
				" _ \n" +
				"  |\n" +
				"  |", lcd.GetNumber("7"));
	}

	@Test
	public void test_for_8() throws Exception {
		assertEquals(
				" _ \n" + 
				"|_|\n" +
				"|_|", lcd.GetNumber("8"));
	}

	@Test
	public void test_for_9() throws Exception {
		assertEquals(
				" _ \n" + 
				"|_|\n" + 
				" _|", lcd.GetNumber("9"));
	}

	@Test
	public void test_for_0() throws Exception {
		assertEquals(
				" _ \n" + 
				"| |\n" + 
				"|_|", lcd.GetNumber("0"));
	}

	@Test
	public void test_for_10() throws Exception {
		assertEquals(
				"    _ \n" +
				"  || |\n" + 
				"  ||_|", lcd.GetNumber("10"));
	}

	@Test
	public void test_for_85246() throws Exception {
		assertEquals(
				" _  _  _     _ \n" +
				"|_||_  _||_||_ \n" + 
				"|_| _||_   ||_|", lcd.GetNumber("85246"));
	}

}
