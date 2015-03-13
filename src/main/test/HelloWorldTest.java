package main.test;

import static org.junit.Assert.assertEquals;
import main.java.HelloWorld;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void test() {
		assertEquals("Hello World", HelloWorld.hello());
	}

}
