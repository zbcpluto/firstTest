package p3_2018_5;

import java.util.ArrayList;

public class SingleCharacterIII {

	public static char singleNumber(char[] characters) {
		if(characters == null || characters.length == 0) {
			return '\0';
		}
		else {
			ArrayList<Character> l1 = new ArrayList<Character>();
			ArrayList<Character> l2 = new ArrayList<Character>();
			l1.add(characters[0]);
			
			for(int i = 1; i < characters.length; i++) {
				boolean isBreak = false;
				boolean isBreak2 = false;
				//检查是否在l1中已出现
				for(int j = 0; j < l1.size(); j++) {
					if(((int)characters[i]^(int)l1.get(j)) == 0) {
						isBreak = true;
						break;
					}
				}
				//检查是否在l2中已出现
				for(int s = 0; s < l2.size(); s++) {
					if(((int)characters[i]^(int)l2.get(s)) == 0) {
						isBreak2 = true;
						break;
					}
				}
				
				if(isBreak2) {
					continue;
				}
				
				if(isBreak) {
					int index = l1.indexOf(characters[i]);
					l1.remove(index);
					l2.add(characters[i]);
				}
				else {
					l1.add(characters[i]);
				}
			}  /*l1收集了所有在characters中只出现一次的字符,有一个bug，同一字符出现次数>=3,且出现奇数次则也会被加入到l1中
				bug已解决*/
			if(l1.size() >= 1) {
				return l1.get(0);
			}
			else {
				return '\0';
			}
		}
    }
	
	public static void main(String[] args) {
		char[] characters = {'a','a','a','b'};
		System.out.println(singleNumber(characters));
	}
	
}
