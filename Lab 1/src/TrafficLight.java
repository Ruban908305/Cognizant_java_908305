import java.util.Scanner;

/**
 * Description - Traffic Light Program
 * @author ponnirmalaruban
 * Date - 14/3/2021
 */
public class TrafficLight {

	public static void main(String[] args) {
		int option;
		   System.out.print("Select the Light:");
		   Scanner obj=new Scanner(System.in);
		   option=obj.nextInt();
		   
		   {
		       if (option==1){
		         System.out.println("Stop");
		         }
		         else if(option==2){
		         System.out.println("ready");  
		        }
		         else{
		         System.out.println("go");
		         }
		   }

	}

}
