import java.util.*;
/**
 * 
 */

/**
 * @author ranje
 *
 */
public class arrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("20");
		list.add("30");
		list.add("40");
		System.out.println("\tI love coding");
		System.out.println(list.size());
		System.out.println("While Loop:");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Advance For Loop:");
		for(Object obj:list) {
			System.out.println(obj);
		}
		System.out.println("For Loop:");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
