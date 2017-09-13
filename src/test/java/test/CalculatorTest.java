package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	Calculator calculator=new Calculator();
	
	@Test
	public void testZero() {
		System.out.println("testZero");
		calculator.add(0.03);
		calculator.subtract(0.02);
		calculator.subtract(0.01);
		System.out.println(calculator.getResult());
		//assert(calculator.isZero());
	}

	@Test
	public void testOne() {
		System.out.println("testOne");
		calculator.add(0.3);
		calculator.add(0.2);
		calculator.add(0.5);
		System.out.println(calculator.getResult());
		assert(calculator.isOne());
	}
	
	@Test
	public void testNaN() {
		System.out.println("testNaN");
		calculator.add(1.0);
		calculator.divideBy(0.0);
		System.out.println(calculator.getResult());
		//assert(calculator.isNaN());
	}
	
	@Test
	public void testLoop() {
		System.out.println("testLoop");
		//calculator.subtract(calculator.getResult());
		calculator.loopAdd(0.1, 10);
		System.out.println(calculator.getResult());
		//assert(calculator.isOne());
	}

	@Test
	public void testPrint() {
		System.out.println("testPrint");
		//calculator.subtract(calculator.getResult());
		calculator.printResult();
		//assert(calculator.isOne());
	}
}
