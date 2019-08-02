/**
 * 
 */

/**
 * @author ranje
 *
 */
public class StringReverseWithoutInbuildMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Ranjeet";
		char chars[]=str.toCharArray();
		for(int i=chars.length-1;i>=0;i--) {
			System.out.print(chars[i]);
		}
	}

}
