package ch04.finaltest;

public class PersonExam {

	public static void main(String[] args) {
		Person p1 = new Person("123141-1231231","짐니");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//final 필드는 수정을 할 수가 없음
		//초기 값이 이미 선언되었기 때문
		p1.name = "엠아이티";
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		

	}

}
