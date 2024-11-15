package CH08_01;

public class Eagle implements Animal{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("두 날개로 날라간다");
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("독수리 울음소리");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("사냥을 해서 먹는다");
	}
	
	

}
