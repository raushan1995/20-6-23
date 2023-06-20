import java.util.TreeSet;

public class Treeset {
	
	public static void main(String args[]) {
		
		TreeSet <String> ts = new TreeSet<String>();
		
		ts.add("A");  
        ts.add("B");  
        ts.add("C");  
        ts.add("D");  
        ts.add("E");  
        
        System.out.println("initial set" + ts);
        
        System.out.println("Reverse Set: "+ ts.descendingSet());  
        
        System.out.println("Head Set: "+ ts.headSet("C", true));  
        
        System.out.println("SubSet: "+ ts.subSet("A", false, "E", true));  
          
        System.out.println("TailSet: "+ ts.tailSet("C", false)); 
	}

}
