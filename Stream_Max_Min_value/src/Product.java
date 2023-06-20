import java.util.ArrayList;
import java.util.List;

public class Product {
	
	 int id;    
	 String name;    
	 float price;
	 
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}  
}

class Test{
	
	public static void main(String args[]) {
		
		List<Product> al = new ArrayList<Product>();
		
		al.add(new Product(1,"HP Laptop",25000f));
		al.add(new Product(2,"Dell Laptop",30000f));
		al.add(new Product(3,"Lenevo Laptop",28000f));
		al.add(new Product(4,"Sony Laptop",28000f));
		al.add(new Product(5,"Apple Laptop",90000f));
		
		Product productA = al.stream().max((product1, product2)->product1.price > product2.price ? 1: -1).get();    
        System.out.println(productA.price); 
        
        Product productB = al.stream().min((product1, product2)->product1.price > product2.price ? 1: -1).get();    
        System.out.println(productB.price);
	}
}
