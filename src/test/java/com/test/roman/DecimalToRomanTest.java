package com.test.roman;

import junit.framework.TestCase;

public class DecimalToRomanTest extends TestCase {
	
	//TDD Decimal to roman
	public void decimalToRomanTest(){
		assertEquals(DecimalToRoman.toRoman(1), 'I');
	}

}
