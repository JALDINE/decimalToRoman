package com.test.roman;

import junit.framework.TestCase;

public class DecimalToRomanTest extends TestCase {
	
	//TDD Decimal to roman
	public void decimalToRomanTest(){
		DecimalToRoman decimal=new DecimalToRoman();
		String roman=decimal.toRoman(1);
	}

}
