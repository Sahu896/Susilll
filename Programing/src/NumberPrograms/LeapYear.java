package NumberPrograms;

public class LeapYear {
	
	public static void main(String[] args) {
		
		int year=1700;
		if ( year%4==0 && (year%100!=0 && year%400!=0))
		{
			System.out.println("it is a leap year");
		}
	
		else
		{
			System.out.println("not a leap year");
		}
	}
}