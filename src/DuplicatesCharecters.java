/**
 * 
 */

/**
 * @author ranje
 *
 */
public class DuplicatesCharecters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= new String("RRaannjjett");
		int count=0;
		char chars[]=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(chars[i]==chars[j]) {
					System.out.println(chars[j]);
					count++;
					break;
				}
			}
		}
	}

}