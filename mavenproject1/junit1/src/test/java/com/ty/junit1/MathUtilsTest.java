package com.ty.junit1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MathUtilsTest {
	
	@EnabledOnOs(OS.LINUX)
	@Test
	public void addTest()
	{
		int expected=10;
		MathUtils mathUtils=new MathUtils();
		int actual=mathUtils.add(6, 4);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void radiusOfCircleTest()
	{
		MathUtils mathUtils=new MathUtils();
		assertEquals(Math.PI, mathUtils.radiusOfCircle(1));
	}
	
	@BeforeEach
	public void beforeEach()
	{
		System.out.println("Before Each running");
	}
	
	@AfterEach
	public void afterEach()
	{
		System.out.println("After Each running");
	}

}
