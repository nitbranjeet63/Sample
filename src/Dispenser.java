import java.util.Scanner;

/**
 * 
 */

/**
 * @author ranje
 *
 */
public class Dispenser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount=0,temp,A,B,C,D;
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the Amount");
		amount=in.nextInt();
		in.close();
		temp=amount%10;
		//System.out.println("Temp % :"+temp);
		if(temp==0) {
			temp=amount;
			while(temp!=0) {
				if(temp>=100) {
					A=temp/100;
					System.out.println("100s :"+A);
					temp=temp%100;
				if(temp>=50) {
					B=temp/50;
					System.out.println("50s :"+B);
					temp=temp%50;
				}
				if(temp>=20) {
					C=temp/20;
					System.out.println("20s :"+C);
					temp=temp%20;
				}
				if(temp>=10) {
					D=temp/10;
					System.out.println("10s :"+D);
					temp=temp%10;
				}
			}else if(temp>=50) {{
				B=temp/50;
				System.out.println("50s :"+B);
				temp=temp%50;
			}
				if(temp>=20) {
					C=temp/20;
					System.out.println("20s :"+C);
					temp=temp%20;
				}
				if(temp>=10) {
					D=temp/10;
					System.out.println("10s :"+D);
					temp=temp%10;
				}}
			else if(temp>=20) {
				{
					C=temp/20;
					System.out.println("20s :"+C);
					temp=temp%20;
				}
				if(temp>=10) {
					D=temp/10;
					System.out.println("10s :"+D);
					temp=temp%10;
				}}
				else if(temp==10) {
					D=temp/10;
					System.out.println("10s :"+D);
					temp=temp%10;
				}
			}
			}
		
		else
			System.out.println("Cannot Dispense Only multiple of 10");
	}

}
