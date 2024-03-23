package LogicalProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class OccuranceOfCharUsingCollection {

	public static void main(String[] args) {
		String s="abbcccdddelkLLLL    jkoanl";
		List<Character> li=new ArrayList<Character>();
		for(int i=0;i<s.length();i++) {
			li.add(s.charAt(i));
		}
		
		Map map=new LinkedHashMap();
		
		for(Character ch:li) {
		int	count=Collections.frequency(li, ch);
		map.put(ch, count);
		}
		
		System.out.println(map);

	}

}
