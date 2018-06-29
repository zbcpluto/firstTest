package p3_2018_5;

import java.util.ArrayList;

public class SingleCharacterII {
	
	public static char singleNumber(char[] characters) {
		if(characters == null || characters.length == 0) {
			return '\0';
		}
		else {
			ArrayList<ArrayList<Object>> l1 = new ArrayList<ArrayList<Object>>();
			ArrayList<Object> l2 = new ArrayList<Object>();
			l2.add(characters[0]);
			l2.add(1);
			l1.add(l2);
			for(int i = 1; i < characters.length; i++) {
				boolean isBreak = false;
				int j = 0;
				for(; j < l1.size(); j++) {
					if(characters[i] == (char)l1.get(j).get(0)) {
						isBreak = true;
						break;
					}
				}
				
				if(isBreak) {
					int n = (int)(l1.get(j).get(1)) + 1;
					l1.get(j).add(1, n);
				}
				else {
					ArrayList<Object> temp = new ArrayList<Object>();
					temp.add(characters[i]);
					temp.add(1);
					l1.add(temp);
				}
			}
			
			ArrayList<Character> finalList = new ArrayList<Character>();
			for(int i = 0; i < l1.size(); i++) {
				if((int)l1.get(i).get(1) == 1) {
					finalList.add((char)l1.get(i).get(0));
				}
			}
			
			if(finalList.size() >= 1) {
				return finalList.get(0);
			}
			else {
				return '\0';
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		char[] characters = {'a','a','b','a','b','c'};
		System.out.println(singleNumber(characters));
	}
	
	
}
