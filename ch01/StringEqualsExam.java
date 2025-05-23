package ch01;

public class StringEqualsExam {

	public static void main(String[] args) {
		// string - 객체를 만들고 사용해야 하며 편의를 위해 생략가능
		
		String strVal1 = "지민";
		String strVal2 = "민지";
		String strVal3 = new String("지민");
		
		System.out.println(strVal1 == strVal2);//안에 메서드가 다르면 틀리다 나옴
		System.out.println(strVal1 == strVal3);
	
		boolean eq1 = strVal1.equals(strVal3);
		System.out.println(eq1);
	}

}
