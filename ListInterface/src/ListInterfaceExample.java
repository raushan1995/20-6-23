import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListInterfaceExample {
	
	public static void main(String args[]) {
		
		List<String> al = new ArrayList<String>();
		
		al.add("ram");
		al.add("shyam");
		al.add("sonoo");
		al.add("monu");
		
		ListIterator<String> itr = al.listIterator();
		
		System.out.println("next element.....................................");
		
		while(itr.hasNext()) {
			System.out.println("index:"+ itr.nextIndex() + "value:"+ itr.next());
			
		}
		System.out.println("previous element.................................");
		
		while(itr.hasPrevious()) {
			System.out.println("index:"+ itr.previousIndex() + "value:"+ itr.previous());
			
		}
	}

}
