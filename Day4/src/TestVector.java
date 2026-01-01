import java.util.Vector;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class TestVector {
	
	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<>();
		List<Integer> l1 = new ArrayList<>();

		ArrayList<Integer> l2 = new ArrayList<>();
		
		
		for (int i=0; i<=10; i++) {
			l1.add(i+10);
		}
		
		

		for (int i=0; i<=10; i++) {
			l2.add(i+20);
		}
		
		
		System.out.println(l1);
		
		System.out.println(l2);
		
		v1.add(25);
		v1.add(35);
		v1.add(45);
		
		
		System.out.println(v1);
		
		
		System.out.println("Capacity : " + v1.capacity());
		
		v1.remove(1);
		
		System.out.println("Size : " + v1.size());
		
		
		for (int i=0; i<10; i++) {
			v1.add(i+10);
		}
		
		System.out.println("Size : " + v1.size());
		
		System.out.println("Capacity : " + v1.capacity());
		
		
		System.out.println(v1);
		
		
		ArrayList<String> fruits = new ArrayList<>();
		
		fruits.add("Banana");
		fruits.add("WAterMelon");
		fruits.add("Coconut");
		
		Iterator<String> i1 = fruits.iterator();
		
		
		
		
		while(i1.hasNext()) {
			String fruit=i1.next();
			System.out.println(fruit + "\n");
			
			
			if(fruit.equals("Banana")) {
				i1.remove();
			}
			
		

		}

		
		System.out.println(fruits + "\n");
		
			
		
		

		
		
	}

}
