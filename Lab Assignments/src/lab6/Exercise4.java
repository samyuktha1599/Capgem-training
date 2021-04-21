package lab6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Exercise4 {
	
	public static void main(String[] args) {
		HashMap<Integer,Integer> map = new HashMap<>();
		map.put(1, 78);
		map.put(2, 82);
		map.put(3, 50);
		map.put(4, 94);
		map.put(5, 67);
		HashMap<Integer,String> hm =  new Exercise4().getStudents(map);
		System.out.println(hm);
	}
    public HashMap<Integer,String> getStudents(HashMap<Integer,Integer> map){
    	HashMap<Integer,String> hm1 = new HashMap<>();
    	Iterator<Integer> itr = map.keySet().iterator();
    	while(itr.hasNext()) {
    		Integer i = itr.next();
    		
    		if(map.get(i) >= 90) {
    			hm1.put(i, "Gold");
    		}else if(map.get(i) >= 80 && map.get(i) < 90) {
    			hm1.put(i, "Silver");
    		}else if(map.get(i) >= 70 && map.get(i) < 80){
    			hm1.put(i, "Bronze");
    		
    		}
    	}
    	return hm1;
    }
	
}
