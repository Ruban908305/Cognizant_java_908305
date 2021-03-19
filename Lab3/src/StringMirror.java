import java.util.Scanner;

public class StringMirror {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
        System.out.println("Enter the word:");
        String str = obj.nextLine();
        
        StringBuffer sb = new StringBuffer(str).reverse();  
     System.out.println(str+"|"+sb.toString());

	}

}
