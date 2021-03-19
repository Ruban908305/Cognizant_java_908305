import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class DifferenceInDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int year,month,date;
		 Scanner obj=new Scanner(System.in);
		 System.out.println("Enter the year : ");
		  year=obj.nextInt();
		  Scanner sc=new Scanner(System.in);
			 System.out.println("Enter the month : ");
			  month=sc.nextInt();
			  Scanner str=new Scanner(System.in);
				 System.out.println("Enter the date : ");
				  date=str.nextInt();
	        LocalDate pdate = LocalDate.of(year, month, date  );
	        LocalDate now = LocalDate.now();
	 
	        Period diff = Period.between(pdate, now);
	 
	     System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", 
	                    diff.getYears(), diff.getMonths(), diff.getDays());
	}

}
