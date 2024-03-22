package q4;

public class Count_num_jancy {
	
	 public static int Count_num_jancy(int number) {
	        if (number == 0) {
	            return 1; // If the number is 0, it has one digit
	        }
	        int count = 0;
	        while (number != 0) {
	            count++;
	            number /= 10;
	        }
	        return count;
	    }
	}