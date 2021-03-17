import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		
		ArrayList<String> names= new ArrayList<>();
	    names.add("Ruban");
	    names.add("Siva");
	    names.add("Kannan");
	    System.out.println("ArrayList: " + names);
	    String[] arr = new String[names.size()];
	    names.toArray(arr);
	    System.out.print("Array: ");
	    for(String item:arr) {
	      System.out.print(item+", ");
	    }

	}

}
