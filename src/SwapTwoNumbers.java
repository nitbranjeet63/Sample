import java.util.Scanner;

/**
 * 
 */

/**
 * @author ranje
 *
 */
public class SwapTwoNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,temp;
		Scanner in = new Scanner(System.in);
		System.out.print("Value X:");
		x=in.nextInt();
		System.out.print("Value Y:");
		y=in.nextInt();
		System.out.println("Before Swaping X:"+x+"  Y:"+y);
		temp=x;
		x=y;
		y=temp;
		System.out.println("After Swaping X:"+x+"  Y:"+y);
		in.close();
	}

}
