package vdchosan;
import java.util.Calendar;
import java.util.Scanner;

public class SinhNhat2 {
       int day, month, year;

       SinhNhat2(){
       }
       SinhNhat2(int day, int month, int year){
	         this.day = day;
	         this.month = month;
	         this.year = year;
}
       double calYearsOld() {
    	   return (Calendar.getInstance().get(Calendar.YEAR) - year);
       }
       public void display() {
    	   System.out.println("Your birthday: " + day + "/" + month + "/" + year);
    	   System.out.println("you: "+ calYearsOld() + " years old");
       }
   public void input() {
	   Scanner scan = new Scanner(System.in);
	   int iday, imonth, iyear;
	   do {
		   System.out.println("Enter year");
		   iyear = scan.nextInt();
		   if (iyear < 1900 || iyear > 2999) {
			   System.out.println("Invalid number of year. Try again!");
		   }
		   else {
			   do {
				   System.out.println("Enter month");
				   imonth = scan.nextInt();
				   if (imonth <=0 || imonth > 12) {
					   System.out.println("Invalid number of mnth.Try again");
				   } else {
					   boolean checkDay = false;
					   do {
						   System.out.println("Enter day");
						   iday = scan.nextInt();
						   if (iday <= 0 || iday > 31) {
							   System.out.println("Invalid number of day.Try again!");
						   } else if ((iyear % 4 !=0 && imonth == 2 && iday > 28) || 
								      ((iyear % 4 == 0 && iyear % 100 !=0) &&imonth == 2 && iday > 29) ||
								      (iyear % 400 == 0 && imonth == 2 && iday > 29) ||
								   ((imonth == 4 || imonth == 6 || imonth == 9 || imonth == 11) && iday > 30)) {
							   System.out.println("Invalid number of day.Try again!");
						   } else { 
							   checkDay = true;
							   day = iday;
							   month = imonth;
							   year = iyear;
						   }
					   } while (!checkDay);
				   }
			   } while (imonth <=0 || imonth >12);
		   }
	   } while (iyear < 1900 || iyear >2999);
   }
	public static void main(String[] args) {
		Sinhnhat bday = new Sinhnhat();
		bday.input();
		bday.display();

	}

}
