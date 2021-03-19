import java.util.Scanner;

public class PowerTwo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
        System.out.println(checkNumber(number));
        }
	public static  boolean checkNumber(int n)
	{
		boolean status=false;
		int i=1,multiple=1;
		while(i>0)
	{
		multiple*=2;
		if(multiple==n)
		{
			status=true;
			break;
		}
		else if(multiple>n)
			break;
		i++;
	}
    
	return status;

	}

}
