import java.util.Scanner;
/**
 * 
 */

/**
 * @author ranje
 *
 */
public class StringPallindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String orignal,reverse="";
		Scanner in = new Scanner(System.in);
		orignal=in.nextLine();
		in.close();
		int length=orignal.length();
		for(int i=length-1;i>=0;i--) {
			reverse=reverse+orignal.charAt(i);
		}
		System.out.println("Orignal: "+orignal+" Reverse :"+reverse);
		if(orignal.equals(reverse))
			System.out.println("Pallindrome");
		else
			System.out.println("Not Pallindrome");
	}

}
