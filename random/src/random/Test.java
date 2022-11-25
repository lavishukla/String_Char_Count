package random;

import java.util.Random;

public class Test {

	public String randomValue() {
		
		String tempPwd = null;
		
	    int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 6;
	    Random random = new Random();
	    StringBuilder buffer = new StringBuilder(targetStringLength);
	    for (int i = 0; i < targetStringLength; i++) {
	        int randomLimitedInt = leftLimit + (int) 
	          (random.nextFloat() * (rightLimit - leftLimit + 1));
	        buffer.append((char) randomLimitedInt);
	    }
	    tempPwd = buffer.toString();	
	    System.out.println(tempPwd);
		return tempPwd;
	}
}
