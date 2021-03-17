import java.util.Arrays;

public class ArrayOfString {

	public static void main(String[] args) {
		 String arr[]={"a","i","r","j","s"};
		 System.out.println(sortStrings(arr));
		 }
		 public static String sortStrings(String arr[])
		 {
		    Arrays.sort(arr);
		    int l=arr.length;
		    String a="",b="";
		    StringBuilder build=new StringBuilder();
		    for(String s:arr){
		    build.append(s);
		 }
		 String ans = build.toString();

		 if(l%2==0)
		 {
		    a=ans.substring(0,l/2).toUpperCase();
		    b=ans.substring(l/2,l).toLowerCase();
		 }
		 else{
		    a=ans.substring(0,l/2).toUpperCase();
		    b=ans.substring(l/2,l).toLowerCase();
		 }
		 String res=a+b;
		 return res;

	}

}
