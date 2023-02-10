package obserbable;

public class Principal {

	public static void main(String[] args) {
		Revista revista = new Revista();
		
		new Subscritor1(revista);
		revista.mandar();
		System.out.println("---------");
		
		
		new Subscritor2(revista);
		new Subscritor3(revista);	
//		
		revista.mandar();
		System.out.println("---------");
		
		
//		revista.attach(s2);
//		revista.mandar();
//		System.out.println("---------");
//		
//		revista.attach(s3);
//		revista.mandar();
//		System.out.println("---------");
		
		
		
		
		

		
		// TODO Auto-generated method stub

	}

}
