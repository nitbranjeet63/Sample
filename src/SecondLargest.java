/**
 * 
 */

/**
 * @author ranje
 *
 */
public class SecondLargest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {14,46,47,94,94,52,86,36,94,89};
		int largest=arr[0];
		int secondlargest=arr[0];
		System.out.println("\n The given array is :");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"\t");
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				secondlargest=largest;
				largest=arr[i];
			}
			else if(arr[i]>secondlargest && arr[i]!=largest) {
				secondlargest=arr[i];
			}
		}
		System.out.println("The Second Largest Value is :"+ secondlargest);
	}

}
