package com.test.roman;

import org.junit.Assert;
import org.junit.Test;

public class DecimalToRomanTest{
	
	//TDD Decimal to roman
	@Test
	public void decimalToRomanTest(){
		Assert.assertEquals(DecimalToRoman.toRoman(2), "II");
	}

}
