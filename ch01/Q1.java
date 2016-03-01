
/* Q1. Implement an algorithm to determine if a string has all unique characters. What
       if you cannot use additional data structures? */

public class Q1 {
	
	// Using additional Space
	public static boolean hasAllUnique(String str){
		boolean[] ascii = new boolean[128];
		for(int i=0;i<str.length();i++){
			if(ascii[str.charAt(i)] == false)
				ascii[str.charAt(i)] = true;
			else
				return false;
		}
		return true;
	}
	
	/* Notes:
	 *  Uses 128 bytes of space O(1),
	 *  Running time is O(n)
	 */
	
	// Without using additional space
	
	/* Notes:
	 *  Can be done in O(nlogn) if c string (sort and check)
	 *  
	 */
	public static boolean hasAllUnique1(String str){
		for(int i = 0 ;i < str.length();i++){
			for(int j = i+1;j<str.length();j++)
				if(str.charAt(i) == str.charAt(j))
					return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(hasAllUnique("carz"));
		System.out.println(hasAllUnique("qwertyuiopasdfghjklzxcvbnm"));
		System.out.println(hasAllUnique("piyush jadhav"));
	}

}
