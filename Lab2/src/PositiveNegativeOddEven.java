import java.util.Scanner;

public class PositiveNegativeOddEven {

	public static void main(String[] args) {
		int Size ,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Number of elements in an array : ");
		Size=sc.nextInt();
		int [] a = new int[Size];
		System.out.println("Please Enter "+Size+"elements of an Array : ");
		for(i = 0 ; i < Size ; i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<Size;i++)
		{
			if(a[i]>=0)
			{
				System.out.println("Positive Number : "+a[i]);
			}
		}
		for(i=0;i<Size;i++)
		{
			if(a[i]<0)
			{
				System.out.println("Negative Number : "+a[i]);
			}
		}
		for(i=0;i<Size;i++)
		{
			if(a[i]==0)
			{
				System.out.println("The number is Zero : "+a[i]);
			}
		}
		for(i=0;i<Size;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("Even Number : "+a[i]);
			}
		}
		for(i=0;i<Size;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println("Odd Number : "+a[i]);
			}
		}
	}

}
