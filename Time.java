public class Time {
	int hour;
	int minute;
	int second;
	public Time() {
		hour = 00;
		minute = 00;
		second = 00;
	}
	public Time(int hour,int minute,int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	void nextSecond() {
		if((this.second == 59) && (this.hour == 23) && (this.minute == 59)) {
			this.second = 00;
			this.minute = 00;
			this.hour = 00;
		}
		else if((this.second == 59) && (this.minute < 59)) {
			this.minute = this.minute + 01;
			this.second = 00;
			this.hour = this.hour;
		}
		else if((this.second == 59) && (this.hour < 23) && (this.minute == 59)) {
			this.second = 00;
			this.minute = 00;
			this.hour = this.hour + 01;
		}
		this.print();
	}
	void nextMinute() {
		if(this.minute < 59) {
			this.minute = this.minute + 01;
			this.hour = this.hour;
			this.second =this.second;
		}
		else if(this.minute == 59) {
			this.minute = 00;
			this.hour = this.hour + 01;
			this.second = this.second;
		}
		this.print();
	}
	void nextHour() {
		if(this.hour == 23) {
			this.hour = 00;
			this.minute = this.minute;
			this.second = this.second;
		}
		else if(this.hour >= 00) {
			this.hour = this.hour + 01;
			this.minute = this.minute;
			this.second = this.second;
		}
		this.print();
	}
	void previousSecond() {
		if(this.hour == 00 && this.minute == 00 && this.second == 00) {
			this.hour = 23;
			this.minute = 59;
			this.second = this.second + 59;
		}
		else if(this.second == 00 && this.minute <= 59) {
			this.second = this.second + 59;
			this.minute = this.minute - 01;
			this.hour = this.hour;
		}
		else if(this.second <= 59)  {
			this.second = this.second - 01;
			this.minute = this.minute;
			this.hour = this.hour;
		}
		this.print();
	}
	void previousMinute() {
		if(this.hour == 00 && this.minute == 00 && this.second == 00) {
			this.second = this.second;
			this.minute = this.minute + 59;
			this.hour = this.hour + 23;
		}
		else if(this.minute <= 59) {
			this.minute = this.minute - 01;
			this.second = this.second;
			this.hour = this.hour;
		}
		this.print();
	}
	void previousHour() {
		if(this.hour == 00) {
			this.hour = 23;
			this.minute = this.minute;
			this.second = this.second;
		}
		else if(this.hour <= 23) {
			this.hour = this.hour - 01;
			this.minute = this.minute;
			this.second = this.second;
		}
		this.print();
	}
	void print() {
		System.out.println(String.format("The Time is:%02d:%02d:%02d",this.hour,this.minute,this.second));
	}
}