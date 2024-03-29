import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 
 */

/**
 * @author ranje
 *
 */
public class HashMapIteration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(2,"Saket");
		map.put(25,"Saurav");
		map.put(12,"HashMap");
		System.out.println(map.size());
		System.out.println("While Loop:");
		Iterator<?> itr=map.entrySet().iterator();
		while(itr.hasNext()){
			@SuppressWarnings("rawtypes")
			Map.Entry me=(Map.Entry)itr.next();
			System.out.println("Key is "+me.getKey()+"  Value is "+me.getValue());
		}
		System.out.println("For Loop:");
		for(@SuppressWarnings("rawtypes") Map.Entry me2:map.entrySet()) {
			System.out.println("Key is "+me2.getKey()+"  Value is "+me2.getValue());
		}
	}

}
