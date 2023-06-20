import java.util.HashSet;

public class Hash {
	
	public static void main(String args[]) {
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("ram");
		hs.add("shyam");
		hs.add("sonoo");
		hs.add("ravi");
		
		System.out.println("An initial list of elements: "+ hs);  
		
		hs.remove("ravi");
		
		System.out.println("after remove of element: "+ hs); 
		
		HashSet<String> hs1 = new HashSet<String>();
		
		hs1.add("ajay");
		hs1.add("monu");
		
		hs.addAll(hs1);
		
		System.out.println("updated list: "+hs); 
		
		hs.removeAll(hs1);
		
		System.out.println("after removeall: "+hs);  
	}

}
