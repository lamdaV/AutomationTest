package test.java;


import static org.junit.Assert.assertEquals;

import java.util.Random;

import main.java.HelloWorld;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void testHello() {
		assertEquals("Hello World", HelloWorld.hello());
	}
	
	@Test
	public void testSum() {
		assertEquals(10, HelloWorld.sum(7, 3));
		assertEquals(4, HelloWorld.sum(2, 2));
		assertEquals(90, HelloWorld.sum(40, 50));
		assertEquals(21, HelloWorld.sum(14, 7));
		assertEquals(2, HelloWorld.sum(-4, 6));
		assertEquals(103, HelloWorld.sum(70, 33));
		assertEquals(10, HelloWorld.sum(5, 5));
		assertEquals(0, HelloWorld.sum(0, 0));
		assertEquals(0, HelloWorld.sum(1, -1));
		assertEquals(Integer.MAX_VALUE, HelloWorld.sum(Integer.MAX_VALUE, 0));
	}
	
	@Test
	public void testDistance() {
		assertEquals(0, HelloWorld.distance(0, 0, 0, 0));
		assertEquals(6, HelloWorld.distance(3, 3, 9, 3));
		assertEquals(31, HelloWorld.distance(30, 2, -1, 8));
		assertEquals(2, HelloWorld.distance(1, 1, 2, 3));
	}
	
	@Test
	public void testSummation() {
		int[] listOfInts = new int[10];
		Random rand = new Random();
		int sum = 0;
		for (int i = 0; i < listOfInts.length; i++) {
			listOfInts[i] = rand.nextInt(40);
		}
		
		for (int k = 0; k < listOfInts.length; k++) {
			sum = sum + listOfInts[k];
		}
		
		assertEquals(sum, HelloWorld.summation(listOfInts));		
	}
	
	@Test
	public void testCombineString() {
		assertEquals("HelloWorld", HelloWorld.combineString("Hello", "World"));
		assertEquals("RainFall", HelloWorld.combineString("Rain", "Fall"));
		assertEquals(":-)", HelloWorld.combineString(":-", ")"));
	}
}