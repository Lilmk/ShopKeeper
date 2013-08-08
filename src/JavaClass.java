import java.io.IOException;


public class JavaClass {

	
	
	
	public static void main (String[] args){
		
		try {
			System.in.read();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	
	
	if(System.in.equals("test")){
		System.out.println("Hey");
	}
	System.out.println("NO");
	
	}
}
