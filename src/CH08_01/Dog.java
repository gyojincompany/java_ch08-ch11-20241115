package CH08_01;

public class Dog implements Animal {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("네발로 움직인다");
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("멍멍");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("강아지 사료를 먹는다");

	}
	
	public void tail() {
		System.out.println("꼬리를 돌린다");
	}

}
