import java.util.Scanner;

/**
 * 
 */

/**
 * @author ranje
 *
 */
public class SwapTwoValuesWithoutThirdVariable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		Scanner in =new Scanner(System.in);
		System.out.print("Value X:");
		x=in.nextInt();
		System.out.print("Value Y:");
		y=in.nextInt();
		System.out.println("Before Swap X:"+x+"  Y:"+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("Before Swap X:"+x+"  Y:"+y);
		in.close();
	}

}
