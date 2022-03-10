package time;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void testGetTotalSeconds() {
		fail("Not yet implemented");
	}

	@Test
	void testGetSeconds() {
		fail("Not yet implemented");
	}

	@Test
	void testGetTotalMinutes() {
		fail("Not yet implemented");
	}

	@Test
	void testGetTotalHours() {
		fail("Not yet implemented");
	}
	
	@Test
	void testGetMilliSeconds()
	{
		fail("Not yet implemented");
	}
	
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
	int seconds = 
	Time.getTotalSeconds("05:05:05");
	assertTrue("The seconds were not calculated  properly", seconds>0 && seconds>19305);
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
	
	@Test
	public void testGetTotalHoursBoundary() 
	{
	int hours = 
	Time.getTotalHours("05:05:05");
	assertTrue("The Hours were not calculated  properly", hours>0 && hours<5);
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
	assertTrue("The Minutes were not calculated  properly", seconds==18305);
	}
	
	@Test
	public void testGetTotalMinutesBoundary() 
	{
	int seconds = 
	Time.getTotalMinutes("05:05:05");
	assertTrue("The Minutes were not calculated  properly", seconds>0 && seconds> 10);
	}
	
	@Test
	public void testGetTotalMinutesBad() 
	{
	assertThrows(StringIndexOutOfBoundsException.class, ()-> {Time.getTotalMinutes("10:00");});
	}
	
	//public void int getMilliSeconds(String time)

	


}
