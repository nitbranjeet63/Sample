import java.util.Scanner;
/**
 * 
 */

/**
 * @author ranje
 *
 */
public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,a=0,b=0,c=1;
		Scanner in =new Scanner(System.in);
		System.out.println("Enter no. of times");
		num=in.nextInt();
		in.close();
		for(int i=0;i<=num;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(a+"");
		}
	}

}
