package TST;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import p2.Calculator;

public class Calculater {
    static Calculator  calc ;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
    	 calc = new Calculator();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@org.junit.Test(timeout=100)
	
		public void testSum_TwoPositive_PositiveNumber() {  
       // Arrange  
	
		//Act
		int result = calc.sum(3, 5);
		// Assert   
		
		   assertTrue(result ==8); 
		   
	}
	@Test
	public void testSum_NigativeLTPositive_PositiveNumber() 
	{  
		int result = calc.sum(-3, 5);
			  assertTrue(result ==2); 
	}
	@Test
	public void testSum_PositiveLTNigative_NigativeNumber() {  
		int result = calc.sum(3, -5);
			  assertTrue(result ==-2); 
	}
	@Test
	public void testSum_TwoNigative_NigativeNumber() {  
		int result = calc.sum(-3, -5);
			  assertTrue(result ==-8); 
	}
	@Test
	public void testSum_ZeroNigative_NigativeNumber() {  
		int result = calc.sum(-3, 0);
			  assertTrue(result ==-3); 
	}  
	@Test
	public void testSum_Zeropositive_PositiveNumber() {  
		int	 result = calc.sum(3, 0);
			  assertTrue(result ==3);
	}	 
	@Test
	public void testSum_TwoZero_Zero() {  
		int	result = calc.sum(0, 0);
			  assertTrue(result == 0); 
	} 
	@Test
	public void testSum_PositiveEENigative_Zero() {  
		int result = calc.sum(-3, 3);
			  assertTrue(result == 0); 
	} 
	
	

}
