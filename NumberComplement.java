package p3_2018_5;

public class NumberComplement {

	public static int findComplement(int num) {
		if(num < 0) {
			return num^(-1);
		}
		else if(num == 0) {
			return 1;
		}
		else if(num == 1) {
			return 0;
		}
		else {
			String str = Integer.toBinaryString(num);
			String str2 = Integer.toBinaryString(num^(-1)).substring(33-str.length());
			return Integer.parseInt(bin2dec(str2));
			}
		}
	
	public static String bin2dec(String input){
		if(input.length() == 1) {
			return input;
		}
		else {
			if(input.charAt(input.length() - 1) == '1') {
				return (2 * Integer.parseInt(bin2dec(input.substring(0, input.length() - 1))) + 1) + "";
			}
			else {
				return 2 * Integer.parseInt(bin2dec(input.substring(0, input.length() - 1))) + "";
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println(findComplement(3));
	}
	
}
