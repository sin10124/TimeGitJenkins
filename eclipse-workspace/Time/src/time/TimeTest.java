package time;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TimeTest {

//	@Test
//	void testGetTotalSeconds() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testGetSeconds() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testGetTotalMinutes() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testGetTotalHours() {
//		fail("Not yet implemented");
//	}
//	
//	@Test
//	void testGetMilliSeconds()
//	{
//		fail("Not yet implemented");
//	}
	
	@Test
	void testGetMilliSecondsGood()
	{
		int a = Time.getMilliSeconds("10:59:50:005");
		assertTrue("The seconds were not calculated properly", a==5);
	}
	
	@Test
	void testGetMilliSecondsBad()
	{
		int a = Time.getMilliSeconds("10:59:50:005");
		assertThrows(StringIndexOutOfBoundsException.class, ()-> {Time.getMilliSeconds("10:00");});
	}
	
	@Test
	void testGetMilliSecondsBoundary()
	{
		int a = Time.getMilliSeconds("09:09:09:009");
		assertTrue("The seconds were not calculated properly", a==9);
	}
	
	@Test
	public void testGetTotalSecondsGood() 
	{
	int seconds = 
	Time.getTotalSeconds("05:05:05");
	assertTrue("The seconds were not calculated  properly", seconds==18305);
	}
	
	@Test
	public void testGetTotalSecondsBoundary() 
	{
		assertThrows(NumberFormatException.class, ()->{Time.getTotalSeconds("05:0:005");});
	}
	
	@Test
	public void testGetTotalSecondsBad() 
	{
	assertThrows(StringIndexOutOfBoundsException.class, ()-> {Time.getTotalSeconds("10:00");});
	}
	
	@Test
	public void testGetTotalHoursGood() 
	{
	int hours = 
	Time.getTotalHours("05:05:05");
	assertTrue("The Hours were not calculated  properly", hours==5);
	}
	
	@ParameterizedTest
	@ValueSource(strings = { "05:00:00", "05:15:15", "05:59:59" })
	public void testGetTotalHoursBoundry(String value) {
		int hr = Time.getTotalHours(value);
		assertTrue("Hours boundry boundry not correct", hr == 5);
	}
	
	@Test
	public void testGetTotalHoursBad() 
	{
	assertThrows(StringIndexOutOfBoundsException.class, ()-> {Time.getTotalHours("5");});
	}
	
	@Test
	public void testGetTotalMinutesGood() 
	{
	int seconds = 
	Time.getTotalMinutes("05:05:05");
	assertTrue("The Minutes were not calculated  properly", seconds==5);
	}
	
	@Test
	public void testGetTotalMinutesBoundary() 
	{
		assertThrows(NumberFormatException.class, ()->{Time.getTotalMinutes("05:0:005");});
	}
	
	@Test
	public void testGetTotalMinutesBad() 
	{
		assertThrows(NumberFormatException.class, ()->{Time.getTotalMinutes("05:0:005");});
	}
	
	//public void int getMilliSeconds(String time)

	


}
