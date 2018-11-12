package amyhoo.github.com.numberGame;

import java.util.List;
import java.util.ArrayList;

/**
 * number game 
 * @author xym
 * @since 2018-11-12
 */
public class App {
	
	// constant for rule1 
	public static final int RULE1_DIVIDER1 = 3;
	public static final int RULE1_DIVIDER2 = 5;
	public static final String RULE1_RESULT1 = "Fizz";
	public static final String RULE1_RESULT2 = "Buzz";
	public static final String RULE1_RESULT3 = "FizzBuzz";
	// constant for rule2
	public static final int RULE2_DIVIDER1 = 3;
	public static final int RULE2_DIVIDER2 = 5;
	public static final String RULE2_RESULT1 = "Fizz";
	public static final String RULE2_RESULT2 = "Buzz";
	public static final String RULE2_RESULT3 = "FizzBuzz";

	public static final String RULE1 = "rule1";
	public static final String RULE2 = "rule2";
	
	public static void main(String[] args) throws Exception {
		if (args.length >1) {
			App instance = new App(); 
			int number = Integer.parseInt(args[0]);
			List<String> output ;
			if (RULE1.equals(args[1])) {
				output = instance.stage1(number);
			}
			else {
				output = instance.stage2(number);
			}
						
			for (String str :output ) {
				System.out.println(str);	
			}
			 
		}
		else {
			System.out.println("please input right parameters");  
		}
	}

	/**
     * filter for rule1
	 * @param int number
	 * @return String
	 */
	private String filter1(int number) {
		if (number % RULE1_DIVIDER1 == 0 && number % RULE1_DIVIDER2 == 0) {
			return RULE1_RESULT3;
		} else if (number % RULE1_DIVIDER1 == 0) {
			return RULE1_RESULT1;
		} else if (number % RULE1_DIVIDER2 == 0) {
			return RULE1_RESULT2;
		}

		else {
			return number + "";
		}
	}

	/**
     * filter for rule2
	 * @param int number
	 * @return String
	 */	
	private String filter2( int number) {
		boolean cond1 = number % RULE2_DIVIDER1 == 0 || String.valueOf(number).contains(String.valueOf(RULE2_DIVIDER1)) ;
		boolean cond2 = number % RULE2_DIVIDER2 == 0 || String.valueOf(number).contains(String.valueOf(RULE2_DIVIDER2)) ;

		if (cond1 && cond2 ) {
    		return RULE1_RESULT3;
    	}
    	else if (cond1) {
    		return RULE1_RESULT1;
    	} 
    	else if(cond2) {
    		return RULE1_RESULT2;
    	}    	
    	else {
    		return number+"";
    	}
    }

	/**
     * generate the whole list of the number for rule1
	 * @param int number
	 * @return List<String>
	 */		
	public List<String> stage1(int number)
    {
		List<String> data = new ArrayList<String>();
    	for (int i=1;i<=number;i++) {
    		data.add(filter1(i));
    	}
    	return data;
    }

	/**
     * generate the whole list of the number for rule2
	 * @param int number
	 * @return List<String>
	 */		
	public List<String> stage2(int number) {
		List<String> data = new ArrayList<String>();
    	for (int i=1;i<=number;i++) {
    		data.add(filter2(i));
    	}
    	return data;
	}
}
