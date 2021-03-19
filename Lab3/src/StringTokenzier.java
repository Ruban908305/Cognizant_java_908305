import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenzier {

	public static void main(String[] args) {
		int number,sum = 0;
		
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number:");
        String s = obj.nextLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            number = Integer.parseInt(temp);
            System.out.println(number);
            sum = sum + number;
        }
        System.out.println("sum of the integer: " +sum);
		obj.close();
        

	}

}
