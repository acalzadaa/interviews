import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsTesting {

	public static void main(String[] args) {

		// Set

		Set<String> nombres = new HashSet<String>();
		nombres.add("alex");
		nombres.add("alex");
		nombres.add("conny");
		nombres.add("sam");
		nombres.add("alex");

		System.out.println("1 " + nombres.toArray().length);
		System.out.println("2 " + nombres.toString());

		// Enviar un SET a un Array
		String[] nombresArray = new String[(nombres.toArray().length)];
		nombresArray = nombres.toArray(nombresArray);
		System.out.println("3 " + nombresArray.length);

		// Enviar un Array a un List
		Set<String> nombres2 = new HashSet<String>(Arrays.asList(nombresArray));
		System.out.println("4 " + nombres2.toString());

		// List

		List<String> nombresList = new ArrayList<String>();

		// Queue

		// Map

		
		
		// Array to List

		// List to Array
	}

}
