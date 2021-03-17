import java.util.Scanner;

public class TestValue {

	public static void main(String[] args) {
		int toFind;
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number : ");  
		  
		toFind=sc.nextInt();
		int[] num = {1, 2, 3, 4, 5};
	    
		
	    boolean found = false;

	    for (int n : num) {
	      if (n == toFind) {
	        found = true;
	        break;
	      }
	    }
	    
	    if(found)
	      System.out.println(toFind + " is found.");
	    else
	      System.out.println(toFind + " is not found.");
	}

}
