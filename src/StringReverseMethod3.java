/**
 * 
 */

/**
 * @author ranje
 *
 */
import java.util.Scanner;

public class StringReverseMethod3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String");
		str=in.nextLine();
		String[] token=str.split("");
		for(int i=token.length-1;i>=0;i--) {
			System.out.print(token[i]);
		}
		in.close();
//		for(String w:token) {
//			System.out.print(w);
//		}
	}

}
