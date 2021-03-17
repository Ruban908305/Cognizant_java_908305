import java.util.Arrays;

public class SecondSmallestElement {

	 public static int getSecondSmallest(int[] arr,int tot){
	        Arrays.sort(arr);
	        return (arr[1]);
	    }
	    
		public static void main(String[] args) {
		    int arr[]={6,9,3,5,1};
		    int len=arr.length;
		    
			System.out.print("Second Smallest Number :" +getSecondSmallest(arr,len));
		}

}
