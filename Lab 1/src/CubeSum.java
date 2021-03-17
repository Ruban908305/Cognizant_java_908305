import java.util.Scanner;

/**
 * Description - The sum of the cubes of digits for the given n digit number
 * @author ponnirmalaruban
 * Date - 14/3/2021
 */
public class CubeSum {

	public static void main(String[] args) {
		int input=0;
	    int num1,num2,num3;
	    System.out.println("Enter a Number");
	    Scanner console = new Scanner(System.in);
	    input= Integer.parseInt(console.nextLine());
	    int number = input; 
	    int counter = 0; 
        int sum=0;
	    while(number>0){
	        int cube= number%10;
	        System.out.println("Cube of "+cube +" is "+(cube*cube*cube));
	        sum=sum+(cube*cube*cube);
	        counter = counter+1;
	        number = number/10;

	    }
		System.out.println("Sum of the cubes : "+sum);
        
	}

}
