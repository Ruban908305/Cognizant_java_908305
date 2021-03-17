import java.util.Scanner;
/**
 * Description - Prime numbers
 * @author ponnirmalaruban
 * Date - 14/3/2021
 */

public class PrimeNumbers {

	public static void main(String[] args) {
		int number,i,j,count;
		   System.out.println("Enter the Number:");
		  Scanner obj=new Scanner(System.in);
		   number=obj.nextInt();
		   for(i=1;i<=number;i++)
		   {
		       count=0;
		       for(j=1;j<=i;j++)
		       {
		      if(i%j==0)
		      count++;
		       }
		       if(count==2)
		       System.out.println("Prime Numbers are : " +i+ " ");

		   }

	}

}
