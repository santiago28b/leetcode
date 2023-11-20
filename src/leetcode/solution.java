package leetcode;

import java.util.HashMap;
import java.util.Map;

public class solution {
	
public static int romanToInt(String s) {
	
	Map <Character, Integer> map = new HashMap();
	
	map.put('I', 1);
	map.put('V', 5);
	map.put('X', 10);
	map.put('L', 50);
	map.put('C', 100);
	map.put('D', 500);
	map.put('M', 1000);
	
	int result = 0;
	
	//suppose IX
	
	for(int i = s.length()-1; i >= 0; i--) { 
		
		int current = map.get(s.charAt(i));
		
		if(i < s.length()-1 && current < map.get(s.charAt(i+1))){
			result -= current;
		} else {
			result += current;
		
		
	}   
    	}
	
	return result;
	}

public static void main(String[] args) {
	System.out.println(romanToInt("CDXL"));
	
	

	}
}
