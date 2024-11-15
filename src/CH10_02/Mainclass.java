package CH10_02;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowTest test = new ThrowTest();
		try {
			test.goRun();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
