package p3_2018_5;

public class TestContinue {
	
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
