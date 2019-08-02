/**
 * 
 */

/**
 * @author ranje
 *
 */
import java.util.Scanner;
public class Reverse4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String orignal,reverse="";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String");
		orignal=in.nextLine();
		int length=orignal.length();
		for(int i=length-1;i>=0;i--) {
			reverse=reverse+orignal.charAt(i);
		}
		System.out.println(reverse);
		in.close();
	}

}
