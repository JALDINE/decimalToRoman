package com.test.roman;

import java.util.TreeMap;

public class DecimalToRoman {
	

	/*create a map variable and attribute to each decimal his roman value.
	 * this map will help us to find the roman value corresponding to a a decimal
	 */
	 private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

	 static {
		map.put(1, "I");
		map.put(4, "IV");
		map.put(5, "V");
		map.put(9, "IX");
		map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(900, "CM");
        map.put(1000, "M");
        
	    }
	 //method to convert decimal to roman number
	 public final static String toRoman(int num) {
		 //look for the key value equal or less than the parameter value.
	        int i =  map.floorKey(num);
	        if ( num == i ) {
	        	//if the parameter value equal to the key value return the roman value corresponding
	            return map.get(num);
	        }
	        /*else we get the roman value and we concatenate to the return value of the toRoman method 
	        the call of toRomain is recursive until we find the key value equal to the parameter value  
	        */
	        return map.get(i) + toRoman(num-i);
	    }

}
