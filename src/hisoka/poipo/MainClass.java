package hisoka.poipo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		/* ArrayList */
		List<Integer> arrList = new ArrayList<Integer>();		
		arrList.add(3); 
		arrList.add(5); 
		arrList.add(7);
		arrList.add(2); 
		
		System.out.println("Hasil sebelum disort " +arrList);
		Collections.sort(arrList);
		System.out.println("Hasil setelah disort " + arrList);
		Collections.reverse(arrList);
		System.out.println("Hasil setelah direverse " + arrList);
		
		/* binary search */
		int indeks = Collections.binarySearch(arrList, 7);
		System.out.println("Indeks : "+ indeks);
	}

}
