package lab8_exercise_6;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DaysDifference {
	public static void main(String[] args) throws ParseException {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the data in dd-MM-yyyy");
		String dateInput=sc.nextLine();
		DateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		Date date=(Date)dateFormat.parse(dateInput);
		System.out.println(date);
		
		Date DiffDate= new Date(0);
		difference(date,DiffDate);
	}

	private static void difference(Date date, Date date2) {
		// TODO Auto-generated method stub
		int year_diff=date2.getYear()-date.getYear();
		year_diff=Math.abs(year_diff);
		int month_diff=date2.getMonth()-date.getMonth();
		year_diff=Math.abs(year_diff);
		int day_diff=date2.getDay()-date.getDay();
		year_diff=Math.abs(year_diff);
	}
}
