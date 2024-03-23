package LogicalProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class OccuranceOfDuplicateNumUsingCollection {

	public static void main(String[] args) {
		int[] b = { 1, 1, 2, 3, 4, 5, 5, 6, 6, 6 };
		List<Integer> li = new ArrayList<>();
		for (int i = 0; i < b.length; i++) {
			li.add(b[i]);
		}

		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

		for (Integer a : li) {
			int count = Collections.frequency(li, a);
			if (count >= 2) {
				map.put(a, count);
			}

		}

		System.out.println(map);

	}

}
