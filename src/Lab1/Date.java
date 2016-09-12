package Lab1;

public class Date {
	
	private int year;
	private int month;
	private int day;
	
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public int daysTo(Date dateTo) {
		
		int days = 0;
		int yDif, mDif, dDif;
		
		// Get the difference between years month days
		yDif = dateTo.year - this.year;
		
		mDif = dateTo.month - this.month;
		
		if (mDif < 0) {
			mDif += 12;
			yDif--;
		}
		
		dDif = (dateTo.day - this.day) % 30;
		
		if (dDif < 0) {
			dDif += 30;
			mDif--;
		}
		
//		System.out.println(yDif);
//		System.out.println(mDif);
//		System.out.println(dDif);
		
		// Add difference of days
		days += yDif * 365;
		days += mDif * 30;
		days += dDif;
		
		return days;
	}
	

}
