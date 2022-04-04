
/*
 * Name: Alec Lienhard
 * Lab Assignment: 3
 * Lab Instructor: Alex Wilson
 * Date: 1/27/20
 */
public class TestClock{
	public static void main(String[] args) {
    
		Clock clock1 = new Clock();
		
		clock1.setTime(23, 22, 42);
		
		 
		clock1.incrementHour();
		
		clock1.incrementMinute();
		
		clock1.incrementSecond();   
		
		System.out.println(clock1);
		
		clock1.incrementSecondsBy(17);
		System.out.println(clock1);
		
		Clock clock2 = new Clock();
		
		clock2.setTime(23, 59, 59);
		
		clock2.incrementMinuteBy(24);
		
		clock2.incrementSecondsBy(1);
		
		System.out.println(clock2);
		
		System.out.println(clock1.equals(clock2));

                    }
		
		//Make a new Clock object with time 00:00:00

		//Set the time of your Clock object to be "23:22:42"

		//Print your clock object, you should get "23:22:42"

		//Increment the hour, minute, and second of your clock by one each

		//Print your clock object, you should get "00:23:43"

		//Increment the seconds of your clock by 17 seconds

		//Print your clock object, you should get "00:24:00"

		//Make a second clock object of time "23:59:59"

		//Increment the minutes of your second clock by 24 minutes and the seconds of your second clock by 1.

		//Print your second clock object, you should get "00:24:00"

		//Print if your first clock object is equal to your second clock object, you should get true

	}	
