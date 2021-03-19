import java.util.Scanner;

public class StringModification {

	public static void main(String[] args) {
		 int num;
		 Scanner obj=new Scanner(System.in);
		 System.out.println("Enter the number : ");
		  num=obj.nextInt();
		  System.out.println("Modified number : ");
		     System.out.print(modifyNum(num));
		}

		public static String modifyNum(int num)
		{
		    String st="";
		    String s=Integer.toString(num);
		    for(int i=0;i<s.length()-1;i++)
		    {
		        if(s.charAt(i)>s.charAt(i+1))
		        st=st+(s.charAt(i)-s.charAt(i+1));
		        else
		        st=st+(s.charAt(i+1)-s.charAt(i));
		    }
		    if(s.charAt(0)>s.charAt(s.length()-1))
		    {
		        st=st+(s.charAt(0)-s.charAt(s.length()-1));
		    }
		    else{
		        st=st+(s.charAt(s.length()-1)-s.charAt(0));
		    }
		        return st;
		}
		
}
