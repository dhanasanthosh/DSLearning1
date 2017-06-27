package com.learning.util;

public class Calc {

	public Integer add(Integer arg1, Integer arg2) throws RuntimeException {
		
		if (arg1 == null || arg2 == null) {
			throw new RuntimeException("Args cannot be null");
		}
		
		return arg1 + arg2;
	}
}
