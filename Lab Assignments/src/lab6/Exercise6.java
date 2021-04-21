package lab6;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Exercise6 {

public static List<Integer>  votersList(HashMap<Integer, String> map) {
		
		LocalDate current = LocalDate.now();
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(Entry<Integer, String> i: map.entrySet()) {
			LocalDate dob = LocalDate.parse(i.getValue());
			Period age = Period.between(dob, current);
			if(age.getYears() > 18) {
				list.add(i.getKey());
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "1997-12-01");
        map.put(2, "2005-09-12");
        map.put(3, "1996-04-02");
        map.put(4, "1888-04-07");
        System.out.println(votersList(map));

	}
}
