import java.util.Scanner;
import java.time.LocalDate;
import java.time.Year;
import java.until.Calendar;
import java.until.Date; 
public class Hello{
//	public static void main (String[] args){
//		System.out.println("write your name and press enter:");
//		Scanner scan = new Scanner(System.in);
//		String name = scan.next();
//		System.out.print("Hello " + name);
//		scan.close();
	//Date birthDate = new Date(2000, SEPTEMBER, 12) ;

	//System.out.println ( " your birthday is " + birthDate);
       // System.out.println("write your name and press enter:");
	Celendar born = Calendar.getInstance();
	Calendar dateOfBirth = Calendar.getInstance();
	dateOfBirth.setTime(birthDate);

	LocalDate today = LocalDate.now();
	LocalDate birthday = LocalDdate.of(2000, SEPTEMBER, 12);
	LocalDate thisYearsBirthday = birthday.with(Year.now());
	long age = ChronoUnit.YEARS.between(birthday, today);
	if (thisYearsBirthday.equals(today)){
	//	System.out.println("Congratulation today is your birthday,and your age is " + age);
	}
	else{
	//	System.out.print("Your age is " + age);
	}
     }
}
