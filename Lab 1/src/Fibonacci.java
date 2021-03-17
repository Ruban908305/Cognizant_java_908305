import java.util.Scanner;
/**
 * Description - Fibonacci sequence
 * @author ponnirmalaruban
 * Date - 14/3/2021
 */
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num , Fib1 = 0, Fib2 = 1;
		System.out.print("Enter the number:");
		   Scanner obj=new Scanner(System.in);
		   num=obj.nextInt();
        System.out.print("First " + num + " terms: ");

        for (int i = 1; i <= num; ++i)
        {
            System.out.print(Fib1 + " ");

            int sum = Fib1 + Fib2;
            Fib1 = Fib2;
            Fib2 = sum;
        }
	}

}
