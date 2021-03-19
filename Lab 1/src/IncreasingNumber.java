import java.util.Scanner;

public class IncreasingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Number : ");
		int number=sc.nextInt();
		if(cheackNumber(number)==true)
			System.out.println("Increasing number");
		else
			System.out.println("Not an increasing number");
	}
	public static boolean cheackNumber(int number)
	{
		String str=Integer.toString(number);
		int count=0;
		boolean statud=false;
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)<=str.charAt(i+1))
			{
				count++;
			}
		}
		boolean status;
		if(count==str.length()-1)
		{
			status=true;
		}
		else
		{
			status=false;
		}
		return status;
	}

}
