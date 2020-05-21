import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class KnapSack {

	public static void main(String[] args) {
		int[][] items = { { 1, 6 }, { 2, 10 }, { 3, 12 } }; // w , v
		int maxWeight = 5;

		int total = knapsack(items, maxWeight);
		System.out.println(total);
	}

	private static int knapsack(int[][] items, int maxWeight) {

		// hashmap para guardar valor vs peso
		HashMap<Integer, Integer> pesoVsValor = new HashMap<>();

		for (int i = 0; i < items.length; i++) {
			pesoVsValor.put(items[i][0], items[i][1]);
		}

		// hashmap para guardar radio vs peso ordenados
		HashMap<Integer, Integer> radioVsPeso = new HashMap<>();

		for (int i = 0; i < items.length; i++) {
			radioVsPeso.put(items[i][1] / items[i][0], items[i][0]);
		}

		List<Integer> mapKeys = new ArrayList<Integer>(radioVsPeso.keySet());
		Collections.sort(mapKeys, Collections.reverseOrder());

		int valor = 0;
		int peso = 0;
		int pesoAcumulado = 0;
		int valorAcumulado = 0;

		for (Iterator iterator = mapKeys.iterator(); iterator.hasNext();) {
			Integer radio = (Integer) iterator.next();
			// add value hasta que no quepa mas
			peso = radioVsPeso.get(radio);
			valor = pesoVsValor.get(peso);
			while ((pesoAcumulado + peso) <= maxWeight) {
				valorAcumulado += valor;
				pesoAcumulado += peso;
			}
		}
		return valorAcumulado;

	}

}
