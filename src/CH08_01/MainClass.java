package CH08_01;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal;
		
		Dog dog = new Dog();  // 인스턴스화 가능(메모리에 객체 생성 가능)
		animal = dog; // 인터페이스 변수에 자식 클래스로 만든 구현 객체 대입
//		dog.cry();
		Eagle eagle = new Eagle();
		animal = eagle; // 인터페이스 변수에 자식 클래스로 만든 구현 객체 대입		
		eagle.eat();
		BlackEagle blackEagle = new BlackEagle();
		animal = blackEagle; // 인터페이스 변수에 자식 클래스에서 상속 받은 손자 클래스 객체도 대입 가능
		animal.cry();
		
		Pudel pudel = new Pudel();//부모가 Dog 클래스
		dog = pudel;//부모는 자식의 모든 것을 받아준다
		pudel = (Pudel) dog;
		
		animal = dog;
		dog = (Dog) animal;
		
		dog.tail();
		
//		double a = 10/0;
		
		try {
			String won = "1,000";// , 도 NumberFormatException 발생
			int pay = Integer.parseInt(won);
			double pay2 = pay * 0.9;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("예외발생 여부와 상관없이 무조건 실행하는 문장을 위치!!");
		}
		System.out.println("예외처리 구간 통과!!");
		System.out.println("프로그램 정상 종료!!");
		
		System.out.println(dog.toString());
		
	}

}
