import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedList {

	public static void main(String[] args) {
		List<String> slist = Arrays.asList("Cinthol", "Hamam", "Pantene", "Mysoresandal", "Lux", "Himalaya");  
		List<String> sortedList = slist.stream().sorted().collect(Collectors.toList());     
		sortedList.forEach(System.out::println);  

	}

}
