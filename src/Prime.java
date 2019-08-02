import java.util.Scanner;

/**
 * 
 */

/**
 * @author ranje
 *
 */
public class Prime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,temp;
		boolean isPrime= true;
		Scanner in= new Scanner(System.in);
		num=in.nextInt();
		in.close();
		for(int i=2;i<=num/2;i++) {
			temp=num%i;
			if(temp==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime)
			System.out.println(num+" is Prime.");
		else
			System.out.println(num+" is Not Prime");		
	}

}
