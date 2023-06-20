
public class Test {
	
	public static void main(String[] args) {
		
		Account acc = new Account();
		
		acc.setAcc_no(123456789L);
		acc.setName("raushan");
		acc.setEmail("abc@gmail.com");
		acc.setAmount(500000f);
		
		System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());
	}

}
