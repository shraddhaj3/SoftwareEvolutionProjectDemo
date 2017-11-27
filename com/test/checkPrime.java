package com.test;

import org.junit.Assert;
import org.junit.Test;

import com.prime.Prime;

public class checkPrime {

	@Test
	public void testTrue() {
		Assert.assertTrue(Prime.isPrime(3));	//isPrime returns false for input 9
	}
	
	@Test
	public void testFalse() {
		Assert.assertFalse(Prime.isPrime(9));	//isPrime returns false for input 9
	}

}
