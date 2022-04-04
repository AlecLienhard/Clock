
public class Clock {
	/*
	 * Name: Alec Lienhard
	 * Lab Assignment: 3
	 * Lab Instructor: Alex Wilson
	 * Date: 1/27/20
	 */
	
		/*
		 * Class properties: one for the hour, minute, and second
		 */
		int hour;
		int minute;
		int second;
		
		/**
		 * all properties set to 0.
		 */
		public Clock() {//Purpose: sets clock equal to 0
						//Parameters: NONE
						//Preconditions:NONE
						//Postconditions:NONE
						//Exceptions: NONE
			
			setTime(0, 0, 0);		

		}
		/**
		 * set local properties to the given parameters.
		 * @param hr The current hour.
		 * @param min The current minute.
		 * @param sec The current second.
		 */
		public Clock(int hr, int min, int sec) {//Purpose: sets clock equal to 0
												//Parameters: hours, minutes, and seconds
												//Preconditions:NONE
												//Postconditions:NONE
												//Exceptions: NONE
			setTime(hr, min, sec);		

		}
		/**
		 * set the time of the clock to be the given parameters.
		 * Make sure the parameters are valid, remember there are not 30 hours in a day.
		 * @param hr The hour to which to set the time.
		 * @param min The minute to which to set the time.
		 * @param sec The second to which to set the time.
		 */
		public void setTime(int hr, int min, int sec) {//Purpose: sets clock to whatever you want
														//Parameters: hours, minutes, seconds
														//Preconditions:NONE
														//Postconditions:NONE
														//Exceptions: NONE
			this.hour = hr;
			this.minute = min;
			this.second = sec;

		}
		/**
		 * returns the hour properties
		 * @return The current hour.
		 */
		public int getHours() {//Purpose: fetches the hours
								//Parameters: NONE
								//Preconditions:NONE
								//Postconditions:NONE
								//Exceptions: NONE
			return this.hour;

		}
		/**
		 * returns the minute properties
		 * @return The current minute.
		 */
		public int getMinutes() {//Purpose: fetches the minutes
								//Parameters: NONE
								//Preconditions:NONE
								//Postconditions:NONE
								//Exceptions: NONE
			return this.minute;

		}
		/**
		 * returns the seconds properties
		 * @return The current second.
		 */
		public int getSeconds() {//Purpose: fetches the seconds
								//Parameters: NONE
								//Preconditions:NONE
								//Postconditions:NONE
								//Exceptions: NONE
			return this.second;

		}
		/**
		 * adds one to the seconds properties.
		 * Remember though, if the seconds is 60 or more you need to increment the
		 * minutes property instead of seconds and the seconds property will be set to 0.
		 */
		public void incrementSecond() {			//Purpose: increases the second count by 1
												//Parameters: NONE
												//Preconditions: less than 60
												//Postconditions:NONE
												//Exceptions: NONE
			if(second == 59) {
				incrementMinute(); second = 0;
			}else {
				second++;
			}
		}
		/**
		 * adds one to the minutes properties.
		 * Remember though, if the minutes is 60 or more you need to increment the
		 * hours property instead of minutes and the minutes property will be set to 0.
		 */
		public void incrementMinute() {//Purpose: increases the second count by 1
										//Parameters: NONE
										//Preconditions:less than 60
										//Postconditions:NONE
										//Exceptions: NONE
			if(minute == 59) {
				incrementHour();
				minute = 0;
			}else {
				minute++;
			}
		}
		/**
		 * adds one to the hours properties.
		 * Remember though, if the hours is 24 or more you need to set
		 * the hours property to 0.
		 */
		public void incrementHour() {//Purpose: increases the hour count by 1
									//Parameters: NONE
									//Preconditions:less than 24
									//Postconditions:NONE
									//Exceptions: NONE
			if(hour == 23) {
				hour = 0;
			}else {
				hour++;
			}

		}
		/**
		 * increments the seconds by a given parameter.
		 * @param count The number of seconds by which to increment the clock.
		 */
		public void incrementSecondsBy(int count) {//Purpose: increases the second count by whatever number specified
													//Parameters: count
													//Preconditions:cannot exceed 60
													//Postconditions:NONE
													//Exceptions: NONE
			for(int i = 0; count > i; i++) {
				incrementSecond();
			}
			

		}
		/**
		 * increments the minutes by a given parameter.
		 * @param count The number of minutes by which to increment the clock.
		 */
		public void incrementMinuteBy(int count) {//Purpose: increases the minute count by whatever number specified
													//Parameters: count
													//Preconditions:cannot exceed 60
													//Postconditions:NONE
													//Exceptions: NONE
			for(int i = 0; count > i; i++) {
				incrementMinute();
			}
		}
		/**
		 * increments the hours by a given parameter.
		 * @param count The number of hours by which to increment the clock.
		 */
		public void incrementHourBy(int count) {
			for(int i = 0; count > i; i++) {
				incrementHour();
			}

		}
		/**
		 * returns true if the parameter clock's time is the same as the local time.
		 * @param clock The other clock to compare with this one.
		 * @returns True if the two Clocks have the same hour, minute, and second.  False otherwise.
		 */
		public boolean equals(Clock clock) {
			if(this.hour == clock.getHours()&& this.minute == clock.getMinutes() && this.second == clock.getSeconds()) {
				return true;
			}
			else {
			return false;
			}
			
			
			
		
			
		
		}
		/**
		 * returns the clock properties as a string in the format "HH:MM:SS"
		 * H = hour, M = minute, S = second.
		 * Always print each number as two digits, for example instead of "1:1:1" for the
		 * return string you will return "01:01:01" so remember to add leading zeros until each
		 * set of numbers has two digits.
		 */
		public String toString() {
			 String string = "";
			 
		        if(hour < 10) {
		             string = "0";
		        }

		        string = string + hour + ":";
		       
		        if(minute < 10) {

		             string = string + "0" ;
		        }
		        string = string + minute + ":";
		        
		 
		        if(second < 10) {

		             string = string + "0";
		        }
		        string = string + second;

		        

		        return string;
		}
	}