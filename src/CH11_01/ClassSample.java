package CH11_01;

import CH08_01.BlackEagle;

public class ClassSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlackEagle blackEagle = new BlackEagle();
		Class clazz = blackEagle.getClass();// blackEagle 객체 클래스의 정보 가져오기
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackageName());
		
		System.out.println("====================");
		String str = "대한민국 파이팅!!";
		System.out.println(str.charAt(3));//문자열내에서 특정한 인덱스에 해당하는 문자 1개를 반환
				
	}

}
