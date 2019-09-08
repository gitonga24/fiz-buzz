package FizBuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class fizBuzzTest {
		//Arrange
			FizzBuzz underTest = new FizzBuzz();
	
	@Test
	public void ShouldSay1For1() {
		
		//Act on the object
		String result = underTest.getResponse(1);
		
		//Assert
		assertEquals("1", result);		
	}
	
	
	@Test
	public void ShouldSay2For2() {
		//Act on the object
		String result = underTest.getResponse(2);
		
		//Assert
		assertEquals("2", result);
	}
	
	
	@Test
	public void ShouldSayFizzFor3() {
		String result = underTest.getResponse(3);
		
		//Assert
		assertEquals("Fizz", result);	
	}
	
	
	@Test
	public void ShouldSayBuzzFor5() {
		String result = underTest.getResponse(5);
		
		//Assert
		assertEquals("Buzz", result);		
	}
	
	
	@Test
	public void ShouldSay4for4() {
		
		String result = underTest.getResponse(4);
		
		assertEquals("4", result);
	}
	
	@Test
	public void ShouldSayFizzFor6() {		
		String result = underTest.getResponse(6);		
		assertEquals("Fizz", result);
		}
	
	@Test
	public void ShouldSay7for7() {
		String result = underTest.getResponse(7);
		
		assertEquals("7", result);
	}
	
	@Test
	public void ShouldSay8For8() {
		String result = underTest.getResponse(8);
		
		assertEquals("8", result);	
	}
	
	@Test
	public void ShouldSayFizzFor9() {
		String result = underTest.getResponse(9);
			assertEquals("Fizz", result);
	}
	
	@Test
	public void ShouldSayBuzzFor10() {
		String result = underTest.getResponse(10);
		
		assertEquals("Buzz", result);
	}
	
	
	
		
	
}
