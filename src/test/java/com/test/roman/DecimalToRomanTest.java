package com.test.roman;

import org.junit.Assert;
import org.junit.Test;

public class DecimalToRomanTest{
	
	//TDD Decimal to roman
	@Test
	public void decimalToRomanTest(){
		//assert that the return value of toRoman method is II
		Assert.assertEquals(DecimalToRoman.toRoman(2), "II");
	}

}
